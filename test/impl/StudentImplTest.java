package impl;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import dao.IStudent;

import pojo.Student;

public class StudentImplTest {
	static IStudent sImpl = null;
	static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		sImpl = (IStudent) context.getBean("studentImpl");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context = null;
		sImpl = null;
	}

	@Test
	public void testSaveStudent() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		Integer ii=(Integer) Class.forName("java.lang.Integer").newInstance();
		 Student stu=(Student) Class.forName("pojo.Student").newInstance();
		 System.out.println(stu.getId());
		 stu.setName("柯江涛111111111111111");
		 System.out.println(sImpl.saveStudent(stu));
	}

	 @Test
	public void testUpdateStudent() {
		 Student stu=new Student();
		 stu.setId(77);
		 stu.setName("柯江涛33");
		 sImpl.updateStudent(stu);
	}

	@Test
	public void testGetInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAll() {
		for (Student temp : sImpl.all()) {
			System.out.println(temp.getName());
		}
	}

	@Test
	public void testSetHibernateTemplate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteStudent() {
		sImpl.deleteStudent(1);
	}

	@Test
	public void testGetString() {
		for (Student temp : sImpl.get("柯")) {
			System.out.println(temp.getName());
		}	}

}
