package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class Whatsappview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		
		System.out.println("          MAIN MENU         ");
	      System.out.println(" select an option");
	      System.out.println("1.create profile");
	      System.out.println("2.view profile");
	      System.out.println("3.delete profile");
	      System.out.println("4.edit profile");
	      System.out.println("5.search profile");
	      System.out.println("6.view all profile");
	      System.out.println("7.login profile");
	      
	      System.out.println("Enter your choice");
	      int c = sc.nextInt();
	      WhatsappControllerInterface wc= new WhatsappController();
	      
	      
	      switch(c)
	      {
	      case 1 :
	    	  wc.createProfileController();
	    	  break;
	      case 2 :
	    	  wc.viewProfileController();
	    	  break;
	      case 3 :
	    	  wc.deleteProfileController();
	    	  break;
	      case 4 :
	    	  wc.editProfileController();
	    	  break;
	      case 5 :
	    	  wc.searchProfileController();
	    	  break; 
	      case 6 :
	    	  wc.viewallProfileController();
	    	  break;
	      case 7 :
	    	  wc.loginProfileController();
	    	  break;
	      default :
	    	  System.out.println(" Wrong Choice");
	    	  
	}
	      

	}

}
