package studentInfoSystem;

public class Main {

	public static void main(String[] args) {
		
		Course mat = new Course("Matematik" , "MAT101" , "MAT");
		Course fizik = new Course("Fizik" , "FZK101" , "FZK");
		Course kimya = new Course("Kimya" , "KMY101" , "KMY");
		
		Teacher t1 = new Teacher("Mahmut Hoca", "MAT", "555555");
		Teacher t2 = new Teacher("Graham Bell" , "FZK" , "11111");
		Teacher t3 = new Teacher("Osman Hoca" , "KMY" , "000000");
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		Student s1 = new Student("Inek Saban" , "25489665" , 4 , mat, fizik, kimya);
		s1.addBulkExamNote(90, 70, 100, 60, 100, 80);
		s1.isPass();
		
		Student s2 = new Student("Guduk Necmi" , "5698524" , 4 , mat, fizik, kimya);
		s2.addBulkExamNote(100, 100, 100, 100, 100, 90);
		s2.isPass();
		
		Student s3 = new Student("Hayta Ismail" , "25896314147" , 4 , mat, fizik, kimya);
		s3.addBulkExamNote(100, 100, 100, 100, 100, 80);
		s3.isPass();
	}

}
