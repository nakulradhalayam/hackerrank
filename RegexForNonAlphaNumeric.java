package com.hackerrank.algorithms;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegexForNonAlphaNumeric {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr = new FileReader("D:/UPD_PROF1528208403355_51records_301sec_request.xml");
		int i;
		List<String> specialCharList = new ArrayList<>();
		 while ((i=fr.read()) != -1)
		 {
			 if(!(Pattern.matches("[a-zA-Z0-9<>]", String.valueOf((char)i))))
			 {
				 if(!specialCharList.contains( String.valueOf((char)i)))
				 {
					 specialCharList.add(String.valueOf((char)i));
				 }
			 }
		 }
		 for (String string : specialCharList) {
			System.out.println(string);
		}

	}

}
