package com.amit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="AIT_USER_DTLS")
public class UserDtlsEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
}
