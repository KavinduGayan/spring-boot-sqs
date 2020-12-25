package com.aws.sqs.model;

import java.util.Date;

public class Message {

    private int id;
    private Date date;
    private String messageBody;

	public Message() {
		this.date=new Date();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	@Override
	public String toString() {
		return "Message{" +
				"id=" + id +
				", date=" + date +
				", messageBody='" + messageBody + '\'' +
				'}';
	}
}
