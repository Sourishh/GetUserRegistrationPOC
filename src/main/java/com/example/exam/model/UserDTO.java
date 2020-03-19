package com.example.exam.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private int userId;
	@NotNull(message = "First name should not be left blank")
	private String firstName;
	private String lastName;
	@Pattern(regexp = "[0-9]{10}", message = "Telephone number should contain 10 digits")
	private String telephone;
	@NotNull(message = "Email ID should not be left blank")
	@Email(message = "Provide a valid email ID")
	private String email;
	private String address;

}
