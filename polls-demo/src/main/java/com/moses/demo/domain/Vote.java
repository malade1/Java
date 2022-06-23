package com.moses.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vote {
	
	@Id
	@GeneratedValue
	@Column(name="vote_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="option_id")
	private Option option;
}
