package chapter07;

public class Student {
	String name;
	int grade;
	String department;
	
//	Student(String n, int g, String d) {
//		name = n;
//		grade = g;
//		department = d;
//	}
//	
//	Student() {
//		
//	}
	
	// 1번 생성자
	Student() {
		
	}
	
	// 2번 생성자
	Student(String n) {
		name = n;
	}
	
	// 3번 생성자
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 4번 생성자
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
}
