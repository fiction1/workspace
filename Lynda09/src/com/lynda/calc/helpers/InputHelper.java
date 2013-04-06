package com.lynda.calc.helpers;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputHelper {
	public static String getInput(String upit){
		BufferedReader stdin= new BufferedReader( 
				new InputStreamReader(System.in));
		
		System.out.print(upit);
		System.out.flush();
		try{
			return stdin.readLine();
		} catch (Exception e){
			return "Error: " +e.getMessage();
		}
		
	}
}
