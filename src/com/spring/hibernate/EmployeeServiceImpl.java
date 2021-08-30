package com.spring.hibernate;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
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
