package com.crud.democrud.Configarations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {

    /**
     * Genera un metodo de cualquier tipo que al inyectarse se devuelva lo que tiene de contenido
     * @return 
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
