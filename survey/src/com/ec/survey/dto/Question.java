package com.ec.survey.dto;
// default package



/**
 * Question entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4179328348522550986L;
	// Fields

	private int QId;
	private int survey;
	private int QType;
	private String QHead;
	private String QBody;
	private String QResult;
	private String QImg;
	private String QJdtz;
	private int QOrder;

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(int QId, int survey) {
		this.QId = QId;
		this.survey = survey;
	}

	/** full constructor */
	public Question(int QId, int survey, int QType, String QHead,
			String QBody, String QResult, String QImg, String QJdtz, int QOrder) {
		this.QId = QId;
		this.survey = survey;
		this.QType = QType;
		this.QHead = QHead;
		this.QBody = QBody;
		this.QResult = QResult;
		this.QImg = QImg;
		this.QJdtz = QJdtz;
		this.QOrder = QOrder;
	}

	// Property accessors

	public int getQId() {
		return this.QId;
	}

	public void setQId(int QId) {
		this.QId = QId;
	}

	public int getSurvey() {
		return this.survey;
	}

	public void setSurvey(int survey) {
		this.survey = survey;
	}

	
	public int getQType() {
		return this.QType;
	}

	public void setQType(int QType) {
		this.QType = QType;
	}


	public String getQHead() {
		return this.QHead;
	}

	public void setQHead(String QHead) {
		this.QHead = QHead;
	}
	
	public String getQBody() {
		return this.QBody;
	}

	public void setQBody(String QBody) {
		this.QBody = QBody;
	}

	
	public String getQResult() {
		return this.QResult;
	}

	public void setQResult(String QResult) {
		this.QResult = QResult;
	}

	
	public String getQImg() {
		return this.QImg;
	}

	public void setQImg(String QImg) {
		this.QImg = QImg;
	}

	
	public String getQJdtz() {
		return this.QJdtz;
	}

	public void setQJdtz(String QJdtz) {
		this.QJdtz = QJdtz;
	}

	
	public int getQOrder() {
		return this.QOrder;
	}

	public void setQOrder(int QOrder) {
		this.QOrder = QOrder;
	}

}