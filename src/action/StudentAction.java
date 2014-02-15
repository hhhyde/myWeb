package action;

import dao.IStudent;
import pojo.Student;

public class StudentAction {
	{
		System.out.println("----进来------");
	}
	private Student student = null;
	private IStudent studentImpl = null;

	public String save() {
		System.out.println(student.getName());
		studentImpl.saveStudent(student);
		return "index";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public IStudent getStudentImpl() {
		return studentImpl;
	}

	public void setStudentImpl(IStudent studentImpl) {
		this.studentImpl = studentImpl;
	}
}
