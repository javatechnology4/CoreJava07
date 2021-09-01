package com.spring.hibernate.annotations;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	/*private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate template) {
		this.hibernateTemplate = template;
	}*/
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public String saveEmployee(Employee employee) {
		Transaction beginTransaction = currentSession().beginTransaction();
		Serializable save = currentSession().save(employee);
		beginTransaction.commit();
		return save != null ? "Successfully Inserted Employee record into Database" : "Insertation failed";
	}

	@Override
	public String updateEmployee(Employee employee, long id) {
		currentSession().saveOrUpdate(employee);
		return "Successfully Inserted Employee record into Database";
		/*List<Employee> find = hibernateTemplate.find("from Employee e where e.id=?", id);
		String message = null;
		for (Employee load : find) {
			load.setEmpCode(employee.getEmpCode());
			load.setEmpCode(employee.getEmpCode());
			load.setJobRole(employee.getJobRole());
			load.setName(employee.getName());
			message = saveEmployee(load);

		}
		return message;*/
	}

	@Override
	public Employee loadEmployee(long id) {
		Employee object =(Employee) currentSession().get(Employee.class, id);
		return object;
		/*List<Employee> find = currentSession().get(Employee.class, id)
		if(!find.isEmpty())
			return find.get(0);
		return null;*/
	}

	@Override
	public String deleteEmployee(Employee employee) {
		currentSession().delete(employee);
		return "Successfully deleted Employee record from Database";
	}

}
