package model;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;
import model.domain.Men;
import model.domain.Women;

@Slf4j

public class Data {
	
	public static ArrayList Array() {
		Men m = new Men("d", "d");
		ArrayList p = new ArrayList();
		p.add(new Men("������", "1"));
		p.add(new Men("����", "1"));
		p.add(new Women("�迬��", "1"));
		
		return p;
	}
}
