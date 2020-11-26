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
					log.trace("�α��� ����");
					logined.remove(i);
					logined.add(i, 1);
					break;
				}else {
					log.trace("�������� �α��� ���Դϴ�.");
					break;
				}
			}
		}
		if(i == al.size()){
			log.trace("�α��� ����");
		}
	}
	
	static void logout(ArrayList al, String s) {
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i).toString().equals(s)) {
				if(logined.get(i) != 0) {
					logined.remove(i);
					logined.add(i, 0);
					log.trace("�α׾ƿ�");
					break;
				}else {
					log.trace("�̹� �α׾ƿ� �����Դϴ�.");
				}
			}
		}
	}
}
