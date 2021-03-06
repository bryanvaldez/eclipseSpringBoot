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
 * Courseclass generated by hbm2java
 */
@Entity
@Table(name = "courseclass", catalog = "test")
public class Courseclass implements java.io.Serializable {

	private Long idCourseClass;
	private String className;
	private Date startHour;
	private Date endHour;
	private Short nroOfHours;
	private String userCreated;
	private Date dateCreated;
	private Byte status;
	private Set<Courseclassdetail> courseclassdetails = new HashSet<Courseclassdetail>(0);

	public Courseclass() {
	}

	public Courseclass(String className, Date startHour, Date endHour, Short nroOfHours, String userCreated,
			Date dateCreated, Byte status, Set<Courseclassdetail> courseclassdetails) {
		this.className = className;
		this.startHour = startHour;
		this.endHour = endHour;
		this.nroOfHours = nroOfHours;
		this.userCreated = userCreated;
		this.dateCreated = dateCreated;
		this.status = status;
		this.courseclassdetails = courseclassdetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCourseClass", unique = true, nullable = false)
	public Long getIdCourseClass() {
		return this.idCourseClass;
	}

	public void setIdCourseClass(Long idCourseClass) {
		this.idCourseClass = idCourseClass;
	}

	@Column(name = "className", length = 100)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "startHour", length = 8)
	public Date getStartHour() {
		return this.startHour;
	}

	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "endHour", length = 8)
	public Date getEndHour() {
		return this.endHour;
	}

	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	@Column(name = "nroOfHours")
	public Short getNroOfHours() {
		return this.nroOfHours;
	}

	public void setNroOfHours(Short nroOfHours) {
		this.nroOfHours = nroOfHours;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseclass")
	public Set<Courseclassdetail> getCourseclassdetails() {
		return this.courseclassdetails;
	}

	public void setCourseclassdetails(Set<Courseclassdetail> courseclassdetails) {
		this.courseclassdetails = courseclassdetails;
	}

}
