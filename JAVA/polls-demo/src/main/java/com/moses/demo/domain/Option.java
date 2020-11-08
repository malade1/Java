package com.moses.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Option {
	@Id
	@GeneratedValue
	@Column(name="option_id")
	private long id;
	
	@Column(name="option_id")
	private String value;

}
