package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import pojo.Student;
import dao.IStudent;

public class StudentImpl implements IStudent {
	private HibernateTemplate hibernateTemplate = null;

	public StudentImpl(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentImpl() {
	}

	@Override
	public int saveStudent(Student student) {
		hibernateTemplate.save("pojo.Student", student);
		return 0;
	}

	@Override
	public void updateStudent(Student stu) {
		hibernateTemplate.update(stu);
	}

	@Override
	public Student get(int id) {
		return (Student) hibernateTemplate.get("pojo.Student", id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> all() {
		return (List<Student>) hibernateTemplate
				.execute(new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						return session.createQuery("FROM Student").list();
					}
				});
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("serial")
	@Override
	public void deleteStudent(int id) {
		hibernateTemplate.delete(new Student(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> get(final String name) {
		return (List<Student>) hibernateTemplate
				.execute(new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						return session
								.createQuery(
										"FROM Student WHERE name LIKE :name")
								.setString("name", "%" + name + "%").list();
					}
				});
	}

}
