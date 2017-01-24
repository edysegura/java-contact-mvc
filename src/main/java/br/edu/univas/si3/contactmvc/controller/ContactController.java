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
		Integer userChoice = view.getUserChoice();
		switch (userChoice) {
			case 1:
				create();
			break;
			
			case 2:
				list();
			break;
			
			case 3:
				delete();
			break;
			
			case 4:
				exit();
			break;

			default:
				view.invalidOption();
			break;
		}
		showMenu();
	}

	private void exit() {
		view.exitMessage();
		System.exit(0);
	}

	private void delete() {
		String email = view.getContactEmail();
		dao.delete(email);
	}

	private void list() {
		ArrayList<ContactTO> list = dao.getList();
		view.showList(list);
	}

	private void create() {
		ContactTO contact = view.getContactData();
		dao.add(contact);
	}
	
}
