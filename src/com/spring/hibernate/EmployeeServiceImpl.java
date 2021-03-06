package com.spring.hibernate;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	private TransactionTemplate transactionTemplate;
	

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.SERIALIZABLE, readOnly=true, timeout=1)
	public String saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
		/*String message=null;
		transactionTemplate.execute(new TransactionCallback<Void>() {

			@Override
			public Void doInTransaction(TransactionStatus status) {
				try {
					employeeDao.saveEmployee(employee);
				}catch(RuntimeException ex) {
					status.setRollbackOnly();
					throw ex;
				}
				
				return null;
			}
		});*/
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
