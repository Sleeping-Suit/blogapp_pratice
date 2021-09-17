package com.cos.blogapp2.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
// insert 하는 것이 아니므로 toEntity는 필요가 없다.
public class LoginReqDto {
	private String username;
	private String password;
}