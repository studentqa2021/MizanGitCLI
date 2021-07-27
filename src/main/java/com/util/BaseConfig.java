package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {

	public String getData(String value) {
		
	File file = new File("./config.properties");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	Properties per = new Properties();	
	try {
		per.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
	System.out.println(per.getProperty(value));			
		return per.getProperty(value);	
	}
	public static void main(String[] args) {
		BaseConfig obj = new BaseConfig();
		obj.getData("QA_URL");
		obj.getData("UserName");
		obj.getData("PassWord");
	}
}
