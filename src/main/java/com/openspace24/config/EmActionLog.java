package com.openspace24.config;

import java.util.Date;

public class EmActionLog {

	private String os;
	private String instituteId;
	private Date logDate;
	private Date logTime;
	private String message;
	private String moduleName;
	private String note;
	private String pageId;
	private String pageName;
	private String browser;
	private String userIp;
	private String userId;
	private Integer noOfAction;

	public String getOs() {
		return os;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public Date getLogDate() {
		return logDate;
	}

	public Date getLogTime() {
		return logTime;
	}

	public String getMessage() {
		return message;
	}

	public String getModuleName() {
		return moduleName;
	}

	public String getNote() {
		return note;
	}

	public String getPageId() {
		return pageId;
	}

	public String getPageName() {
		return pageName;
	}

	public String getBrowser() {
		return browser;
	}

	public String getUserIp() {
		return userIp;
	}

	public String getUserId() {
		return userId;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getNoOfAction() {
		return noOfAction;
	}

	public void setNoOfAction(Integer noOfAction) {
		this.noOfAction = noOfAction;
	}

}
