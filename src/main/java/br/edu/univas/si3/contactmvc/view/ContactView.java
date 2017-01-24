package br.edu.univas.si3.contactmvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.si3.contactmvc.model.ContactTO;

public class ContactView {
	
	Scanner input;
	
	public ContactView() {
		input = new Scanner(System.in);
	}
	
	public Integer menu() {
		Integer userChoice;
		System.out.println("1) Create new contact");
		System.out.println("2) List contacts");
		System.out.println("3) Exit");
		System.out.print("Inform your option: ");
		userChoice = input.nextInt();
		return userChoice;
	}
	
	public ContactTO getContactData() {
		ContactTO contact = new ContactTO();
		System.out.print("Name: ");
		contact.setName(input.next() + input.nextLine());
		System.out.print("E-mail: ");
		contact.setEmail(input.next() + input.nextLine());
		return contact;
	}
	
	public void showList(ArrayList<ContactTO> list) {
		System.out.println("--------------------------------");
		for (ContactTO contact : list) {
			System.out.println("Name: " + contact.getName());
			System.out.println("E-mail: " + contact.getEmail());
		}
		System.out.println("--------------------------------");
	}

}
