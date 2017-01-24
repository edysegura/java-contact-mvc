package br.edu.univas.si3.contactmvc.controller;

import java.util.ArrayList;

import br.edu.univas.si3.contactmvc.model.ContactDAO;
import br.edu.univas.si3.contactmvc.model.ContactTO;
import br.edu.univas.si3.contactmvc.view.ContactView;

public class ContactController {
	
	private ContactDAO dao;
	private ContactView view;
	
	public ContactController(ContactDAO dao, ContactView view) {
		this.dao = dao;
		this.view = view;
	}
	
	public void init() {
		showMenu();
	}

	private void showMenu() {
		Integer userChoice = view.menu();
		switch (userChoice) {
			case 1:
				create();
			break;
			
			case 2:
				list();
			break;
			
			case 3:
				System.exit(0);
			break;

			default:
			break;
		}
	}

	private void list() {
		ArrayList<ContactTO> list = dao.getList();
		view.showList(list);
		showMenu();
	}

	private void create() {
		ContactTO contact = view.getContactData();
		dao.add(contact);
		showMenu();		
	}
	
	
	
	

}
