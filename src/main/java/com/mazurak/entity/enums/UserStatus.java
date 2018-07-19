package com.mazurak.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserStatus {
	ACTIVE("active"),
	ACTIVATION_PENDING("pending"),
	NOT_ACTIVATED("not active");
	private String status;
}
