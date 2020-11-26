
package view;

import java.util.ArrayList;

import model.Data;

public class StartView {
	public static void main(String[] args) {
		EndView view = new EndView();
		ArrayList array = Data.Array(); 
		view.setDefault(array);
		view.login(array, "ÇöÁØ");
		view.login(array, "±è¿¬Áö");
		view.login(array, "±è¿¬Áö");
		view.logout(array, "±è¿¬Áö");
		view.login(array, "±è¿¬Áö");


	}
}
