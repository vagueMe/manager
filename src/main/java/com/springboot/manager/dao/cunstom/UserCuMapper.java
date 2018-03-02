package com.springboot.manager.dao.cunstom;


import com.springboot.manager.model.dto.UserDto;
import com.springboot.manager.model.form.UserForm;

import java.util.List;

public interface UserCuMapper {

    List<UserDto> selectLimit(UserForm userForm);

}