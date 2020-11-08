package com.moses.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {
	
	@Id
	@GeneratedValue
	@Column(name="vote_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="option_id")
	private Option option;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", option=" + option + "]";
	}
}
