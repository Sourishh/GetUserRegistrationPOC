package com.example.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private Long userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "mobile_no")
	private String mobileNo;
	@Column(name = "email_address")
	private String email;
	@Column(name = "address")
	private String address;

}
