package model.domain;

import lombok.Builder;


public class Men extends People {
	public Men(String id, String pw) {
		super(id, pw);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return id;
	}
	
	
}
