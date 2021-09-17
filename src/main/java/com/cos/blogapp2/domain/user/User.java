package com.cos.blogapp2.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
@Entity	// 이게 있어야 테이블이 만들어 진다.
// DB에 가져올때, 화면에서 주입할 때 - Setter는 실무에서 사용하지 않음. 초기화 사용으로 실무에서는 생성자를 쓴다.

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String email;
}
