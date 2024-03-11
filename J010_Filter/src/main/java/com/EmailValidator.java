package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
		
		public static boolean emailCheck(String email)
		{
			boolean b = false;
			Pattern petter = Pattern.compile("^[a-zA-Z0-9]+@[a-z]+\\.[a-z]+$");
			
			Matcher match = petter.matcher(email);
			
			 b =  match.matches();
			
			return b;
		}
		
}
