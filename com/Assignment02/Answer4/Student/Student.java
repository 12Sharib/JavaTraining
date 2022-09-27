package com.Assignment02.Answer4.Student;
	
	public class Student {
		private Integer studentId;
		private String subjectName;
		private Integer studentMarks;

		public Integer getStudentId() {
			return studentId;
		}
		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}
		public String getSubjectName() {
			return subjectName;
		}
		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
		public Integer getStudentMarks() {
			return studentMarks;
		}
		public void setStudentMarks(Integer studentMarks) {
			this.studentMarks = studentMarks;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", subjectName=" + subjectName + ", studentMarks=" + studentMarks
					+ "]";
		}
		

	}


