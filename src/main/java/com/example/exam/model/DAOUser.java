package com.example.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String telephone;
	private String email;
	private String address;

}
