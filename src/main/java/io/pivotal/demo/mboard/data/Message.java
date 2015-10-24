package io.pivotal.demo.mboard.data;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@NotEmpty(message = "Message is required.")
	private String text;

	@NotEmpty(message = "Summary is required.")
	private String summary;

	private Calendar created = Calendar.getInstance();

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getCreated() {
		return this.created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}