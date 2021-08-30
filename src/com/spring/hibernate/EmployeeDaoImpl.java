package com.spring.hibernate;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate template) {
		this.hibernateTemplate = template;
	}

	@Override
	public String saveEmployee(Employee employee) {
		Serializable save = hibernateTemplate.save(employee);
		return save != null ? "Successfully Inserted Employee record into Database" : "Insertation failed";
	}

	@Override
	public String updateEmployee(Employee employee, long id) {
		hibernateTemplate.saveOrUpdate(employee);
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
		List<Employee> find = hibernateTemplate.find("from Employee e where e.id=?", id);
		if(!find.isEmpty())
			return find.get(0);
		return null;
	}

	@Override
	public String deleteEmployee(Employee employee) {
		hibernateTemplate.delete(employee);
		return "Successfully deleted Employee record from Database";
	}

}
