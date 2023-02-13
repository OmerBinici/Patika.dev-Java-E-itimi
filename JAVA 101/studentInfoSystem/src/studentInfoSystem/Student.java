package studentInfoSystem;

public class Student {
	String name;
	String stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double average;
	boolean isPass;

	
	
	Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		calcAverage();
		this.isPass = false;
	}
	
	public void addBulkExamNote(double mat,double matOralExam, double fizik, double fizikOralExam, double kimya, double kimyaOralExam) {
		if(mat >= 0 && mat <= 100) {
			this.mat.note = mat;			
		}
		
		if(fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}
		
		if(kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
		}
		
		if(matOralExam >= 0 && matOralExam <= 100) {
			this.mat.oralExam = matOralExam;			
		}
		
		if(fizikOralExam >= 0 && fizikOralExam <= 100) {
			this.fizik.oralExam = fizikOralExam;
		}
		
		if(kimyaOralExam >= 0 && kimyaOralExam <= 100) {
			this.kimya.oralExam = kimyaOralExam;
		}
		
	}
	
	public void isPass() {
		if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.oralExam == 0 || this.fizik.oralExam == 0 || this.kimya.oralExam == 0) {
			System.out.println("Notlar tam olarak girilmemis");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.average);
			if (this.isPass) {
				System.out.println("Sinifi Gecti.");
			} else {
				System.out.println("Sinifta Kaldi.");
			}
		}
	}
	
	public void calcAverage() {
		this.average = (((this.mat.note * 0.8) + (this.mat.oralExam * 0.2)) + ((this.fizik.note * 0.8) + (this.fizik.oralExam * 0.2)) + ((this.kimya.note * 0.8) + (this.kimya.oralExam * 0.2))) / 3;
	}
	
	public boolean isCheckPass() {
		calcAverage();
		return this.average > 55;
	}
	
	void printNote() {
		System.out.println("------------------------------");
		System.out.println("Ogrenci : " + this.name);
		System.out.println("Matematik Notu : " + this.mat.note);
		System.out.println("Matematik Sozlu Notu : " + this.mat.oralExam);
		System.out.println("Fizik Notu : " + this.fizik.note);
		System.out.println("Fizik Sozlu Notu : " + this.fizik.oralExam);
		System.out.println("Kimya Notu : " + this.kimya.note);
		System.out.println("Kimya Sozlu Notu : " + this.kimya.oralExam);
	}
	
	
}
