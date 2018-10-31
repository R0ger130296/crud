package com.example.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User extends parentEntity {

	
	private static final long serialVersionUID = 186846492040550174L;

	@Column(name = "first_name", nullable=false, length=255 )
	private String firstName;
	
	@Column(name = "second_name", nullable=true, length=255 )
	private String secondName;
	
	@Column(name = "first_surname", nullable=false, length=255 )
	private String firstSurname;
	
	@Column(name = "second_surname", nullable=true, length=255 )
	private String secondSurname;
	
	@Column(name = "phone", nullable=true, length=30 )
	private String phone;
	
	@Column(name = "address", nullable=false, length=150 )
	private String address;
	
	@Column(name = "cedula" , nullable=false, length=15 )
     private String cedula;
	 
	@Column(name = "correopersonal" , nullable=false, length=45 )
    private String correoPersonal;
	
	@Column(name = "correoespe" , nullable=false, length=45 )
    private String correoEspe;
	
	@Column(name = "exttelefono" , nullable=false, length=5 )
    private String extTelefono;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getcorreoPersonal() {
		return correoPersonal;
	}
	public void setcorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	public String getcorreoEspe() {
		return correoEspe;
	}
	public void setcorreoEspe(String correoEspe) {
		this.correoEspe = correoEspe;
	}
	public String getextTelefono() {
		return extTelefono;
	}
	public void setextTelefono(String extTelefono) {
		this.extTelefono = extTelefono;
	}
	
}
