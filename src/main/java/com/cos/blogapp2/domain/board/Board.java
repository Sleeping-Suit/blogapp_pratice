package com.cos.blogapp2.domain.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.cos.blogapp2.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Entity
@Getter
@AllArgsConstructor

public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@Lob		// 칼럼을 4GB로 생성
	private String content;

	@ManyToOne
	private User user;		// object로 설정해야함 private 'User'
}