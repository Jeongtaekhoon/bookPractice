package chapter07;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student("홍길동", 4, "소프트웨어공학과");
		
		System.out.println(std.name);
		System.out.println(std.grade);
		System.out.println(std.department);
		
		System.out.println();
		
		Student std2 = new Student("정택훈" , 1, "세무회계과");
		
		System.out.println(std2.name);
		System.out.println(std2.grade);
		System.out.println(std2.department);
		
		Student std3 = new Student();  // 매개변수가 있는 생성자를 정의한 경우 기본생성자는 생성불가  직접 정의해주면 가능
		
	}

}
