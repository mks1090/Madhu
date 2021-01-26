package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes")// madhu
public class Note {
	@Id
	private int id;
	private String tite;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTite() {
		return tite;
	}
	public void setTite(String tite) {
		this.tite = tite;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	private Date addedDate;
	public Note(int id, String tite, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(100000);
		this.tite = tite;
		this.content = content;
		this.addedDate = addedDate;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

}
