package com.aruth.practice;

class Vehicle {
	void engine() {
		System.out.println("petrol engine");
	}
	void fuel() {
		System.out.println("petrol");
	}
}
class Yamaha extends Vehicle {
	void enginecc() {
		System.out.println("220cc");
	}
}
class Bajaj extends Vehicle {
	void display() {
		System.out.println("digital display");
	}
}
class Honda extends Vehicle {
	void horn() {
		System.out.println("special horn");
	}
}
public class Inheritance {
	public static void main(String [] args) {
		Honda obj = new Honda();
		obj.horn();
		obj.engine();
	}
}
