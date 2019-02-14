package com.suraj.streams;

public class News {
	String postedByuser,commentByUser,comment;
	int newid;
	public News(String postedByuser, String commentByUser, String comment,int newid) {	
		
		this.postedByuser = postedByuser;
		this.commentByUser = commentByUser;
		this.comment = comment;
		this.newid = newid;
		
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "News [postedByuser=" + postedByuser + ", commentByUser="
				+ commentByUser + ", comment=" + comment + ", newid=" + newid
				+ "]";
	}
	/**
	 * @return the postedByuser
	 */
	public String getPostedByuser() {
		return postedByuser;
	}
	/**
	 * @param postedByuser the postedByuser to set
	 */
	public void setPostedByuser(String postedByuser) {
		this.postedByuser = postedByuser;
	}
	/**
	 * @return the commentByUser
	 */
	public String getCommentByUser() {
		return commentByUser;
	}
	/**
	 * @param commentByUser the commentByUser to set
	 */
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the newid
	 */
	public int getNewid() {
		return newid;
	}
	/**
	 * @param newid the newid to set
	 */
	public void setNewid(int newid) {
		this.newid = newid;
	}
	

}
