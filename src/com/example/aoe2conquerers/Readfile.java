package com.example.aoe2conquerers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
	
	public String readIn(String fileIn){
		String fileContent="";
		
		try
		{
			//make filereader object to read the file
			FileReader file = new FileReader(fileIn);
			//create bufferreader to wrap the file 
			BufferedReader fileStream = new BufferedReader(file);
			
			
			String temp=fileStream.readLine();
			while(temp!=null)
			{
			fileContent=fileContent + " " +temp;	
			temp=fileStream.readLine();
			
			
			
		
			}	
			fileStream.close();
					
		}
		catch(FileNotFoundException e)
		{
			
		System.out.println("No file was read");	
		}
			catch(IOException e)
			{
				System.out.println("There was a problem reading the file");
			}
			return fileContent;
		}

}
