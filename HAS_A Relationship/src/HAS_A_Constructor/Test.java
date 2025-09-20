package HAS_A_Constructor;

public class Test {
	public static void main(String[] args) {

		Department dpt = new Department(201, "ECE");

		College clg = new College(111, "SSVPS", dpt);

		Student stu = new Student(65, "Rohit Patil", clg);

		System.out.println(dpt.getDptId());
		System.out.println(dpt.getDptName());
		System.out.println(clg.getClgId());
		System.out.println(clg.getClgName());
		System.out.println(stu.getStdId());
		System.out.println(stu.getName());

		Student stu1 = new Student(15, "Pratik Patil", clg);

		System.out.println("*******************************");
		System.out.println(dpt.getDptId());
		System.out.println(dpt.getDptName());
		System.out.println(clg.getClgId());
		System.out.println(clg.getClgName());
		System.out.println(stu1.getStdId());
		System.out.println(stu1.getName());

	}
}
