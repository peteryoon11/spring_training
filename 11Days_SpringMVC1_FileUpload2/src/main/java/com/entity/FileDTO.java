package com.entity;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileDTO {
	private String theText;
	private CommonsMultipartFile theFile;

	public String getTheText() {
		return theText;
	}

	public void setTheText(String theText) {
		this.theText = theText;
	}

	public CommonsMultipartFile getTheFile() {
		return theFile;
	}

	public void setTheFile(CommonsMultipartFile theFile) {
		this.theFile = theFile;
	}

	public FileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileDTO(String theText, CommonsMultipartFile theFile) {
		super();
		this.theText = theText;
		this.theFile = theFile;
	}

	@Override
	public String toString() {
		return "theText=" + theText + " theFile=" + theFile;
	}

}
