package com.spring.core.jdbc;

public class PersonServiceImpl implements PersonService {
	private PersonDao personDao;

	@Override
	public String addPerson(Person person) {
		// TODO Auto-generated method stub
		return personDao.addPerson(person);
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public String updatePerson(Person person,long id) {
		// TODO Auto-generated method stub
		return personDao.updatePerson(person,id);
	}

	@Override
	public String deletePerson(long id) {
		// TODO Auto-generated method stub
		return personDao.deletePerson(id);
	}
	

}
