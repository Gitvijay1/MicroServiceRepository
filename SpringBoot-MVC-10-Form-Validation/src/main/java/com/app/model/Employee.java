package com.app.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp2")
@Data
public class Employee {
	@Id
	private Integer eid;
	private String ename;
	private String job;
	private String gender;
	private String org;
	private String enpNote;
	@ElementCollection
	private List<String> like;

}
