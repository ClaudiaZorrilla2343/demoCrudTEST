package com.crud.democrud.services.Rol;

import com.crud.democrud.dtos.RolDTO;
import com.crud.democrud.services.IEntityService;

public interface IRolService extends IEntityService<RolDTO> {

    void put(RolDTO entity);
}
