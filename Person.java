package com.demotest;

public class Person {
	
			private String name;
			private Mydate dateofbirth;
			
			public Person(String name,Mydate dateofbirth) {
				this.name = name;
				this.dateofbirth = dateofbirth;
			}
			
			public String getname() {
				return name;
			}
			public void setname(String name) {
				this.name = name;
			}
			public Mydate getdateofbirth() {
				return dateofbirth;
			}
			public void setdateofbirth(Mydate dateofbirth) {
				this.dateofbirth = dateofbirth;
			}
			
			@Override
			public String toString() {
				return "name:"+name+"Date of birth:"+dateofbirth;
			}
	
}
