package HasA;

public class Test {
		public static void main(String[] args) {
			
			Student stu = new Student();
			stu.setStdId(1);
			stu.setName("Rohit Patil");
			
			
			College clg = new College();
			clg.setClgId(201);
			clg.setClgName("SSVPS");
			
			stu.setClg(clg);
			
			
			
			System.out.println(stu.getStdId());
			System.out.println(stu.getName());
			System.out.println(stu.getClg().getClgId());
			System.out.println(stu.getClg().getClgName());
			System.out.println(clg.getDpt().getDptId());
			System.out.println(clg.getDpt().getDptName());
			
			
		}
}
