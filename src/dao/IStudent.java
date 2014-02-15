package dao;

import java.util.List;

import pojo.Student;

public interface IStudent {

	public int saveStudent(Student stu);

	public void deleteStudent(int id);

	public void updateStudent(Student stu);

	public Student get(int id);

	public List<Student> get(String name);

	public List<Student> all();

}
