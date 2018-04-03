package com.test;

import java.util.HashMap;
import java.util.Map;

public class PassByValue {

	public static void main(String[] args) {
		String s = "abc";
		Map passed = new HashMap();
		passed.put(1, "Adnsds");
		passed.put(2, "ffdshkd");
		new PassByValue().test(passed);
		 System.out.println("in main:" + passed.size());

	}
	
	public void test(Map s){
		s = null;
		//return s;
	}
	
	public static void test2(String s){
		s= "wskfkf";
		System.out.println("in test2:" + s);
	}
	

}
