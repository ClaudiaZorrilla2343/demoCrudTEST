package com.crud.democrud.dtos;

import lombok.Data;

/**
 * Genera los getter, setters y constructor requerido
 */
@Data
public class UserDTO {

    private Long id;
    private String name;
    private Integer priority;
    private String email;

}
