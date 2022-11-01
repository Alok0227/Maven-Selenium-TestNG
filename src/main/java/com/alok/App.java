package com.alok;

import java.util.ResourceBundle;

public class App {
	
	public int Login(String in_name, String pass) {
		
//		Getting the bundles of resources from config.properties files.
		ResourceBundle rs = ResourceBundle.getBundle("config");
		
//		Managing the bundles user-name and password for our user-password
		String username = rs.getString("username");
		String password = rs.getString("password");
		
//		if the user-name and password matches with config file then return 1 or else 0
		if(in_name.equals(username) && pass.equals(password)) {
			return 1;
		}else {
			return 0;
		}
				
		
	}

}
