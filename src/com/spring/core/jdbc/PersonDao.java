package com.spring.core.jdbc;

public interface PersonDao {
	public String addPerson(Person person);
	public String updatePerson(Person person,long id);
	public String deletePerson(long id);

}
