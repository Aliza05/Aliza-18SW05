class Mark
{ 
			public static void main(String args[])
 			{
			Student s1=new Student("Aliza","18sw05",18);
			Marksheet m1=new Marksheet();
			m1.java=85;
			m1.cpp=90;
			m1.maths=95;
			Result r1=new Result(s1,m1);
	                r1.createStudentResult();
			}
}