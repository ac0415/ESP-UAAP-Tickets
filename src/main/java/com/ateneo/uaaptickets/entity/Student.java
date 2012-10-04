package com.ateneo.uaaptickets.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sun.istack.internal.NotNull;

@Entity(name="student")
public class Student {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	@NotNull
	private int id;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name="student_id", unique=true)
	@NotNull
	private int studentId;
	
	@Column(name="first_name")
	@NotNull
	private String firstName;
	
	@Column(name="last_name")
	@NotNull
	private String lastName;
	
	@Column(name="middle_name")
	@NotNull
	private String middleName;
	
	@Column(name="address")
	@NotNull
	private String address;
	
	@Column(name="contact_number")
	@NotNull
	private String telephone;
	
	@Column(name="contact_number2")
	@NotNull
	private int cellphone;
	
	@Column(name="year")
	@NotNull
	private int year;
	
	@Column(name="course")
	@NotNull
	private String course;
	
	@Column(name="gender")
	@NotNull
	private String gender;	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getCellphone() {
		return cellphone;
	}
	public void setCellphone(int cellphone) {
		this.cellphone = cellphone;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@OneToMany(mappedBy="student")
	private List<Ticket> tickets;

	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Column(name="catch_phrase", nullable=false)
	private String catchPhrase;
	
	@OneToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="updated_at")
	private Date updatedAt;
	
	@Column(name="image_url")
	private String imageUrl;

	@Transient
	private CommonsMultipartFile imageFile;

	@Column(name="confirmation_string", unique=true)
	@NotNull
	private String confirmationString;
	
	public String getConfirmationString() {
		return confirmationString;
	}
	public void setConfirmationString(String confirmationString) {
		this.confirmationString = confirmationString;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public CommonsMultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(CommonsMultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public Student()
	{
		createdAt = new Date();
		updatedAt = new Date();
		
		imageUrl = "/images/bunny.jpg";
	}
}
