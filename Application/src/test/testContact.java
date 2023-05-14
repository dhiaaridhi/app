package test;

import contact.ContactImpl;
import contact.contacts;
import java.util.List;

public class testContact {

	

	public static void main(String[] args) {
		ContactImpl contact = new ContactImpl ();
		List<contacts> cont = contact.getcontactsParMotCle("01234567");
		for (contacts c : cont)
			System.out.print(c.getNom());
	}

}
