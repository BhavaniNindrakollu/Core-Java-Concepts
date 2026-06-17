package com.oopsfoundation;

public class Methods {
	
	
	static void backEndTechnologies() { 
		
		String languageName1 = "Java";
		
		String languageName2 = "SpringBoot";
		
		String languageName3 = "MySql";
		
		System.out.println("BackEndTechnologies Language Name1 is :"+languageName1);
		
		System.out.println("BackEndTechnologies Language Name2 is :"+languageName2);
		
		System.out.println("BackEndTechnologies Language Name3 is :"+languageName3);
		
		
		}
	void frontEndTechnologies( String techName ) {
		
		String html ="Basic Code";
		
		String css = "Styling ";
		
		String js = "Functioning";
		
        System.out.println("FrontEndTechnologies Language Name1 HTML  is uded to construct :"+html);
		
		System.out.println("FrontEndTechnologies Language Name2 CSS is used for:"+css);
		
		System.out.println("FrontEndTechnologies Language Name3 JS is used for :"+js);
		
	}
	
	void middleWare () {
		
		String REST_API = "Communication";
		
		String Apache = "Tomcat /Server";
		
        System.out.println("middleWare Language Name1 REST_API is used for:"+REST_API);
		
		System.out.println("middleWare Language Name2 Apache is used for :"+Apache);
		
	}
	
	int classification (int noOfPartsCanBeDivided) {
		
		return noOfPartsCanBeDivided;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("ALL THE INFORMATION IS BELONGS TO JAVA FULSTACK DEVELOPMENT");
		
		Methods md = new Methods ();
		
		backEndTechnologies();
		
		md.frontEndTechnologies("FrontEndTechnologies");
		
		md.middleWare();
		System.out.println("Total fullstack can be classified into "+md.classification(3)+" parts");
		
		
	}
	
	
}
