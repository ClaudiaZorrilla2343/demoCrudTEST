package com.crud.democrud.services.Rol;

import com.crud.democrud.Exceptions.NoFoundException;
import com.crud.democrud.dtos.RolDTO;
import com.crud.democrud.models.Rol;
import com.crud.democrud.repositories.RolRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RolService implements IRolService {

    private final RolRepository rolRepository;

    private final EntityManager entityManager;

    @Setter(onMethod_ = @Autowired)
    private ModelMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public RolDTO findById(Long id) {

        return mapper.map(rolRepository.findById(id)
                        .orElseThrow(NoFoundException::new),
                RolDTO.class);

    }

    @Transactional(readOnly = true)
    @Override
    public List<RolDTO> findAll() {
        return rolRepository.findAll().stream().map(rolModel -> mapper.map(
                rolModel, RolDTO.class
        )).toList();
    }

    @Override
    @Transactional
    public void save(RolDTO entity) {
        rolRepository.save(mapper.map(entity, Rol.class));
    }

    @Override
    public void delete(Long id) {
        rolRepository.deleteById(id);
    }

    public void delete(String rol) {

    }

    @Override
    @Transactional
    public void put(RolDTO entity) {
        entityManager.merge(mapper.map(entity, Rol.class));
    }
}
