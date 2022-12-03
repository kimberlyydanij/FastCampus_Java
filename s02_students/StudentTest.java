package s02_students;

public class StudentTest {

	public static void main(String[] args) {
		
		Students studentLee = new Students(100,"Lee");
		studentLee.setKoreaSubject("국어",100);
		studentLee.setMathSubject("수학",95);

		Students studentKim= new Students(101,"Kim");
		studentKim.setKoreaSubject("국어",80);
		studentKim.setMathSubject("수학",99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
