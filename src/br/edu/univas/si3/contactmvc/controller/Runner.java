package br.edu.univas.si3.contactmvc.controller;

import br.edu.univas.si3.contactmvc.model.ContactDAO;
import br.edu.univas.si3.contactmvc.view.ContactView;

public class Runner {
	public static void main(String[] args) {
		ContactDAO dao = new ContactDAO();
		ContactView view = new ContactView();
		ContactController c = new ContactController(dao, view);
		c.init();
	}
}
