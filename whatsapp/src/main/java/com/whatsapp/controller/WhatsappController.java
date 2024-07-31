package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {

	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Address");
		
		String address=sc.next();
				
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.getAddress();
		WhatsappServiceInterface ws=new WhatsappService();
		int i=ws.createProfileService(wu);
		
		
		
		
		
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewallProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
	}

}
