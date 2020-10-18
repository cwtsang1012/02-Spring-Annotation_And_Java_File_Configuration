package com.springcore.annotations;

import java.io.*;
import java.util.*;

import javax.annotation.PostConstruct;

//import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements IFortuneService {
	
	//private String fileName = "C:/foobar/fortune-data.txt";
	private String fileName = "C:/Users/cwtsa/Documents/Web Programming/Java/fortune-data.txt";
	
	private List<String> data;
	
	private Random random = new Random();
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: default constructor - FileFortuneService()");
	}
	
	@PostConstruct	//execute before bean is considered as "injectable"
	//@Bean(initMethod="LoadDataFile") //execute a method after a bean's initialization
	public void LoadDataFile() {
		try 
		{
			System.out.println(">> FileFortuneService: @PostConstruct - LoadDataFile()");
			
			data = new ArrayList<String>();
			
			File theFile = new File(fileName);
			
			System.out.println("File path: " + fileName);
			System.out.println("File exists: " + theFile.exists());
			
			BufferedReader reader = new BufferedReader(new FileReader(theFile));
	        String line;
	        while ((line = reader.readLine()) != null) {
	        	data.add(line);
	        }
	        reader.close();
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.size());
		return this.data.get(index);
		
	}

}
