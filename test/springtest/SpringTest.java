package springtest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;

public class SpringTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Student stu = new Student();
		System.out.println(stu.getGrade());
		// 配置Spring的配置文件
		ApplicationContext aContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println(aContext);
		// 通过Spring配置文件来创建学生对象
		Student stu2 = (Student) aContext.getBean("stu");
		System.out.println(stu2.getName());
		System.out.println(stu2.getId());
	}

}
