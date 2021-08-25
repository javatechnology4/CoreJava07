package com.spring.hibernate;

public class User {
	private Long id;
	private String username;
	private String password;
	//private Address homeAddress;
	//private Address billingAddress;
	private Address address;
	public User() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address address) {
		this.homeAddress = address;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}*/
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(id==null) return false;
		if(!(obj instanceof User)) return false;
		final User user=(User)obj;
		return this.id.equals(user.getId());
				
	}
	@Override
	public int hashCode() {
		return id==null? System.identityHashCode(this):id.hashCode();
	}

}
