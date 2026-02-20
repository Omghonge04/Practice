package com.package2;

import com.package1.Person;

public class Test extends Person{
  public static void main(String[] args) {
  
	Person p = new Person();
	
	System.out.println(p.name);
	System.out.println(p.age);
	System.out.println(p.city);
}
}
