package com.spring.hibernate.annotations;

public interface EmployeeService {
	public String saveEmployee(Employee employee);
	public String updateEmployee(Employee employee, long id);
	public Employee loadEmployee(long id);
	public String deleteEmployee(Employee employee);

}
