package s02_students;

public class Students {

		int studentId;
		String studentName;
		
		Subject korea;
		Subject math;
		
		public Students(int id, String name) {
			
			studentId = id;
			studentName = name;
			
			korea = new Subject();
			math = new Subject();
		
		} // end Students
		
		public void setKoreaSubject(String name, int score) {
			korea.subjectName = name;
			korea.score = score;
		}
		
		public void setMathSubject(String name, int score) {
			math.subjectName = name;
			math.score = score;
		}
		
		public void showStudentScore() {
			int total = korea.score + math.score;
			System.out.println(studentName + " 학생의 총점은 " +  total + " 점 입니다.");
		}
} //end class
