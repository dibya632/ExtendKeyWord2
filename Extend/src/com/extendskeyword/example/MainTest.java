package com.extendskeyword.example;

public class MainTest {
	public static void main(String[]args) {
		ParentTest p=new ParentTest();
		System.out.println(p.x);
		p.getPrentName();
		
		ChildTest c=new ChildTest();
		System.out.println(c.y);
		c.getChildName();
		c.getPrentName();
		
		ParentTest c1=new ChildTest();
		
	    
	}

}
