package com.bolsadeideas.springboot.web.app.models;

public class Usuario {

	private String name;
	private String lastname;
	private String email;

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", lastname=" + lastname + ", email=" + email + "]";
	}

	public Usuario() {

	}

	public Usuario(String name, String lastname, String email) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
