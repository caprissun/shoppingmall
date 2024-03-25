package com.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE nonUser(
		phone VARCHAR(30),
        email VARCHAR(20)
	);
*/
@Setter
@Getter
@ToString
public class NonUserVO {

	private String phone;
	private String email;
}
