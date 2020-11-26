package view;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class EndView {
	static ArrayList<Integer> logined = new ArrayList<Integer>();
	static void setDefault(ArrayList al){
		for(int i = 0; i < al.size(); i++) {
		logined.add(i, 0);
		}
	}
	static void login(ArrayList al, String input) {
		int i;
		for(i = 0; i < al.size(); i++) {
			if(al.get(i).toString().equals(input)) {
				if(logined.get(i) == 0) {
					log.trace("로그인 성공");
					logined.remove(i);
					logined.add(i, 1);
					break;
				}else {
					log.trace("누군가가 로그인 중입니다.");
					break;
				}
			}
		}
		if(i == al.size()){
			log.trace("로그인 실패");
		}
	}
	
	static void logout(ArrayList al, String s) {
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i).toString().equals(s)) {
				if(logined.get(i) != 0) {
					logined.remove(i);
					logined.add(i, 0);
					log.trace("로그아웃");
					break;
				}else {
					log.trace("이미 로그아웃 상태입니다.");
				}
			}
		}
	}
}
