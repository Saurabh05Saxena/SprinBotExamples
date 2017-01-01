package com.org.micro.insta.feeds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feeds {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	private final String content;

	public Feeds(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
