package com.ec.survey.dto;

// default package

import java.util.Date;

/**
 * Survey entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Survey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5612405124894422928L;
	// Fields

	private int SId;
	private int templet;
	private String SName;
	private String SDesc;
	private String SAuthor;
	private String SImg;
	private char SIpRepeat;
	private Date SCreateDate;
	private String SIpLimitType;
	private String SIpRange;
	private String SPassword;
	private char SIsOpen;
	private Date SExpireDate;
	private char SIsAudited;
	private int SHits;
	private int SUsehits;

	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
	}

	public int getTemplet() {
		return templet;
	}

	public void setTemplet(int templet) {
		this.templet = templet;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getSDesc() {
		return SDesc;
	}

	public void setSDesc(String sDesc) {
		SDesc = sDesc;
	}

	public String getSAuthor() {
		return SAuthor;
	}

	public void setSAuthor(String sAuthor) {
		SAuthor = sAuthor;
	}

	public String getSImg() {
		return SImg;
	}

	public void setSImg(String sImg) {
		SImg = sImg;
	}

	public char getSIpRepeat() {
		return SIpRepeat;
	}

	public void setSIpRepeat(char sIpRepeat) {
		SIpRepeat = sIpRepeat;
	}

	public Date getSCreateDate() {
		return SCreateDate;
	}

	public void setSCreateDate(Date sCreateDate) {
		SCreateDate = sCreateDate;
	}

	public String getSIpLimitType() {
		return SIpLimitType;
	}

	public void setSIpLimitType(String sIpLimitType) {
		SIpLimitType = sIpLimitType;
	}

	public String getSIpRange() {
		return SIpRange;
	}

	public void setSIpRange(String sIpRange) {
		SIpRange = sIpRange;
	}

	public String getSPassword() {
		return SPassword;
	}

	public void setSPassword(String sPassword) {
		SPassword = sPassword;
	}

	public char getSIsOpen() {
		return SIsOpen;
	}

	public void setSIsOpen(char sIsOpen) {
		SIsOpen = sIsOpen;
	}

	public Date getSExpireDate() {
		return SExpireDate;
	}

	public void setSExpireDate(Date sExpireDate) {
		SExpireDate = sExpireDate;
	}

	public char getSIsAudited() {
		return SIsAudited;
	}

	public void setSIsAudited(char sIsAudited) {
		SIsAudited = sIsAudited;
	}

	public int getSHits() {
		return SHits;
	}

	public void setSHits(int sHits) {
		SHits = sHits;
	}

	public int getSUsehits() {
		return SUsehits;
	}

	public void setSUsehits(int sUsehits) {
		SUsehits = sUsehits;
	}

	public static void main(String args[]) {
		Survey s = new Survey();
		System.out.println(s.SIpRepeat);
	}

}