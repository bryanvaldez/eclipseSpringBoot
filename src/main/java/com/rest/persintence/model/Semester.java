package com.rest.persintence.model;
// Generated 26-mar-2018 12:04:19 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Semester generated by hbm2java
 */
@Entity
@Table(name = "semester", catalog = "test")
public class Semester implements java.io.Serializable {

	private Long idSemester;
	private String semesterName;
	private String description;
	private String userCreated;
	private Date dateCreated;
	private Byte status;
	private Set<Enrollment> enrollments = new HashSet<Enrollment>(0);

	public Semester() {
	}

	public Semester(String semesterName, String description, String userCreated, Date dateCreated, Byte status,
			Set<Enrollment> enrollments) {
		this.semesterName = semesterName;
		this.description = description;
		this.userCreated = userCreated;
		this.dateCreated = dateCreated;
		this.status = status;
		this.enrollments = enrollments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idSemester", unique = true, nullable = false)
	public Long getIdSemester() {
		return this.idSemester;
	}

	public void setIdSemester(Long idSemester) {
		this.idSemester = idSemester;
	}

	@Column(name = "semesterName", length = 50)
	public String getSemesterName() {
		return this.semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "userCreated", length = 100)
	public String getUserCreated() {
		return this.userCreated;
	}

	public void setUserCreated(String userCreated) {
		this.userCreated = userCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateCreated", length = 19)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semester")
	public Set<Enrollment> getEnrollments() {
		return this.enrollments;
	}

	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

}
