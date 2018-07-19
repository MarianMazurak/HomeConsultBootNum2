package com.mazurak.mapper;

import com.mazurak.dto.UserDto;
import com.mazurak.entity.User;
import com.mazurak.entity.enums.UserRole;

public interface UserMapper {

	static User userDtoToUser(UserDto userDto) {
		User user = new User();

		user.setEmail(userDto.getEmail());
		user.setPassworg(userDto.getPassword());
		user.setUserRole(UserRole.ROLE_USER);
		return user;
	}
}
