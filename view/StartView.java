
package view;

import java.util.ArrayList;

import model.Data;

public class StartView {
	public static void main(String[] args) {
		EndView view = new EndView();
		ArrayList array = Data.Array(); 
		view.setDefault(array);
		view.login(array, "����");
		view.login(array, "�迬��");
		view.login(array, "�迬��");
		view.logout(array, "�迬��");
		view.login(array, "�迬��");


	}
}
