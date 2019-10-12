package com.xworkz.assetmanagement.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginDTO implements Serializable {

	private String name;
	private int password;
	private String emailId;
	private String role;
	private String generated_password;
	private String reset;
}
