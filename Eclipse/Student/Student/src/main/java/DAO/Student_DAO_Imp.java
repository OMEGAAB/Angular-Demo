package DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.Student;

@Repository
public class Student_DAO_Imp  implements Student_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveStudent(Student student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(student);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
