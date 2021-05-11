#!/usr/bin/env groovy

int age;
	   age = 18;
	   
	switch (age) {
	  
	case 18:
		System.out.println("You can Vote Now");
		break;
		
	case 25:
		System.out.println("You can marry now");
		break;
	case 60:
		System.out.println("You can Retire Now");
	    break;
	    
	default:
		System.out.println("You have to wait");
		
	}   
