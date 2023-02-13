package studentInfoSystem;

public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	double note;
	double oralExam;
	
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.oralExam = 0;
		
	}
	
	
	public void addTeacher(Teacher t) {
		if (this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println("Islem Basarili.");
		} else {
			System.out.println(t.name + "Akademisyeni bu dersi veremez.");
		}
	}
	
	
	public void printTeacher() {
		if (courseTeacher != null) {
			System.out.println(this.name + " dersinin Akademisyeni" + courseTeacher.name);
		} else {
			System.out.println(this.name + " dersine Akademisyen atanmamıstır.");
		}
	}

}
