package com.spring.hibernate.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value="employeeService")
@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.SERIALIZABLE, readOnly=true, timeout=1)
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	//@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.SERIALIZABLE, readOnly=false, timeout=1)
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployee(employee);
	}

	@Override
	public String updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee, id);
	}

	@Override
	public Employee loadEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeDao.loadEmployee(id);
	}

	@Override
	public String deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employee);
	}

}
