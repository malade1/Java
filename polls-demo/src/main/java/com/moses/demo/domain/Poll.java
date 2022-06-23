package com.moses.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Poll {

	@Id
	@GeneratedValue
	@Column(name="poll_id")
	private Long id;
	
	@Column(name="question")
	private String question;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="poll_id")
	@OrderBy
	private Set<Option> options;
	
}
