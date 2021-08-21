package com.spring.core.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PersonDaoImpl implements PersonDao {
	private JdbcTemplate jdbcTemplate;
	private static final String INSET_QUERY = "insert into person values(?,?,?,?,?)";
	private static final String SELECT_PERSON=" select * from person where id=?";
	private static final String UPDATE_PERSON="update person set id=?,firstname=?,lastname=?,fullname=?,email=? where id=? ";
	private static final String DELETE_PERSON="delete from person where id=? ";
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public String addPerson(Person person) {
		int update = jdbcTemplate.update(INSET_QUERY, person.getId(), person.getFirstName(), person.getLastName(),
				person.getFullname(), person.getEmail());

		return update > 0 ? "Successfully inserted person record" : "we got some exception";
	}


	@Override
	public String updatePerson(Person person,long id) {
		@SuppressWarnings("unchecked")
		List<Person> query = jdbcTemplate.query(SELECT_PERSON, new RowMapper() {

			@Override
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person person =new Person();
				while(rs.next()) {
					person.setFirstName(rs.getString(1));
					person.setLastName(rs.getString(2));
					person.setFullname(rs.getString(3));
					person.setEmail(rs.getString(4));
				}
				return person;
			}
		}, id);
		if(!query.isEmpty()) {
			Person person2 = query.get(0);
			person2.setId(id);
			person2.setFirstName(person.getFirstName());
			person2.setLastName(person.getLastName());
			person2.setFullname(person.getFullname());
			person2.setEmail(person.getEmail());
			return upPerson(person2);
			
		}
		return null;
	}


	private String upPerson(Person person) {
		int update = jdbcTemplate.update(UPDATE_PERSON, person.getId(), person.getFirstName(), person.getLastName(),
				person.getFullname(), person.getEmail(),person.getId());
		return update > 0 ? "Successfully updated person record" : "we got some exception";
	}


	@Override
	public String deletePerson(long id) {
		int update = jdbcTemplate.update(DELETE_PERSON, id);
		return update > 0 ? "Successfully deleted person record" : "we got some exception";
	}

}
