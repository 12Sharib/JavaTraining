package co.Assignment03.Answer3.Question04.Model;

public class Subject {
	private Integer subjectId;
	private String subjectName;
	private Integer subjectMarks;
	public Subject(Integer subjectId, String subjectName, Integer subjectMarks) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectMarks = subjectMarks;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getSubjectMarks() {
		return subjectMarks;
	}
	public void setSubjectMarks(Integer subjectMarks) {
		this.subjectMarks = subjectMarks;
	}
	@Override
	public String toString() {
		return "SubjectElements [subjectId = " + subjectId + ", subjectName = " + subjectName + ", subjectMarks = "
				+ subjectMarks + "]";
	}
}
