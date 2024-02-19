package com.bootcamp.first;

import java.util.Objects;

public class PostResponse {
	
	private String userId;
	private String id;
	private String title;
	private String body;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "PostResponse [id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	public PostResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostResponse other = (PostResponse) obj;
		return Objects.equals(id, other.id);
	}

	
	

}
