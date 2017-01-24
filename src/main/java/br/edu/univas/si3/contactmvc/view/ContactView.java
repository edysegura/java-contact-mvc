package br.edu.univas.si3.contactmvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.si3.contactmvc.model.ContactTO;

public class ContactView {
	
	Scanner input;
	
	public ContactView() {
		input = new Scanner(System.in);
	}
	
	public Integer getUserChoice() {
		Integer userChoice;
		int count = 1;
		separator();
		
		System.out.println((count++) + ") Create new contact");
		System.out.println((count++) + ") List contacts");
		System.out.println((count++) + ") Delete");
		System.out.println((count++) + ") Exit");
		System.out.print("Inform your option: ");
		
		userChoice = input.nextInt();
		
		return userChoice;
	}
	
	private void separator() {
		System.out.println("\n------------------------------------\n");		
	}

	public ContactTO getContactData() {
		
		separator();
		
		ContactTO contact = new ContactTO();
		System.out.print("Name: ");
		contact.setName(readLine());
		System.out.print("E-mail: ");
		contact.setEmail(readLine());
		
		return contact;
	}
	
	public String getContactEmail() {
		separator();
		
		System.out.println("Inform the contact email to delete: ");
		String email =  readLine();
		
		return email;
	}

	private String readLine() {
		return input.next() + input.nextLine();
	}
	
	public void showList(ArrayList<ContactTO> list) {
		for (ContactTO contact : list) {
			
			separator();
			
			System.out.println("Name: " + contact.getName());
			System.out.println("E-mail: " + contact.getEmail());
		}
	}

	public void invalidOption() {
		System.out.println("Please, inform a valid option!");		
	}

	public void exitMessage() {
		separator();
		System.out.println("See ya!");
	}

}
