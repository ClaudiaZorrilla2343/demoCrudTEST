package com.crud.democrud.services.User;

import com.crud.democrud.Exceptions.NoFoundException;
import com.crud.democrud.dtos.UserDTO;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUserService {

    private final UsuarioRepository usuarioRepository;


    @Setter(onMethod_ = @Autowired)
    private ModelMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {

        return mapper.map(usuarioRepository.findById(id)
                        .orElseThrow(NoFoundException::new),
                UserDTO.class);

    }

    @Transactional(readOnly = true)
    @Override
    public List<UserDTO> findAll() {
        return usuarioRepository.findAll().stream().map(usuarioModel -> mapper.map(
                usuarioModel, UserDTO.class
        )).toList();
    }

    @Override
    @Transactional
    public void save(UserDTO entity) {
        usuarioRepository.save(mapper.map(entity, UsuarioModel.class));
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

    public void delete(String user) {

    }
}