package br.edu.univas.si3.contactmvc.model;

import java.util.ArrayList;

public class ContactDAO {
	
	private ArrayList<ContactTO> contacts;
	
	public ContactDAO() {
		contacts = new ArrayList<ContactTO>();
	}
	
	public void add(ContactTO contact) {
		contacts.add(contact);
	}
	
	public void update(ContactTO contact) {
		//if you are using the database/file, the update code
		//should be here
	}
	
	public void delete(ContactTO contact) {
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<ContactTO> getList() {
		return (ArrayList<ContactTO>) contacts.clone();
	}

}
