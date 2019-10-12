package com.xworkz.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="asset_management")
public class LoginEntity {
	private String emailId;
	private int password;

}
