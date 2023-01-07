package com.javatechie.app.git_demo;

public class App {

	public void addData(String name) {
		System.out.println("data : "+ name);
		if(name.equals(Constant.name)) {
			System.out.println("Welcome");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}
