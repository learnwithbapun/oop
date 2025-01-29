package com.hsbc.basiclogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ascii {

	
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a character");
	byte b=(byte)System.in.read();
	System.out.println(b);
	}

}
