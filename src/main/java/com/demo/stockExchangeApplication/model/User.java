package com.demo.stockExchangeApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int userId;
	@NotEmpty(message="*please enter username")
	@Pattern(regexp="[a-zA-Z]{3,10}", message="*Please enter 3-10 characters only")
	@Column(name="username")
	private String userName;
	@NotEmpty(message="*please enter a valid password")
	@Column(name="password")
	private String password;
	@NotEmpty(message="*please Confirm a password")
	@Column(name="cpassword")
	private String cpassword;
	private String usertype;
	@NotEmpty(message="*please enter Email")
	@Email(message = "Email should be valid")
	@Column(name="email")
	private String email;
	@NotNull(message="*please enter MobileNo")
	@Column(name="mobile_number")
	private long mobileno;
	@Column(name="confirmed")
	private boolean confirmed;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getUserType() {
		return usertype;
	}
	public void setUserType(String userType) {
		this.usertype = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	
}
