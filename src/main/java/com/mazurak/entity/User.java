package com.mazurak.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mazurak.entity.enums.UserRole;
import com.mazurak.entity.enums.UserStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {

	private String email;

	private String passworg;

	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt = new Date();

	@Enumerated(EnumType.STRING)
	private UserRole userRole;

	// токен на підтвердження email на активацію акаунта
	private String token;

	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	
	@Column(name = "profile_image_url", length = 500)
	private String profileImageUrl;
}
