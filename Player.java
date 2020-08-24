package com.player.model;

import java.util.Date;

public class Player {
	private Date pdob;
	private String pid;
	private String pfName;
	private String plName;
	private String pCountry;
	private int pRecords;
	public Date getPdob() {
		return pdob;
	}
	public void setPdob(Date pdob) {
		this.pdob = pdob;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPfName() {
		return pfName;
	}
	public void setPfName(String pfName) {
		this.pfName = pfName;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public String getpCountry() {
		return pCountry;
	}
	public void setpCountry(String pCountry) {
		this.pCountry = pCountry;
	}
	public int getpRecords() {
		return pRecords;
	}
	public void setpRecords(int pRecords) {
		this.pRecords = pRecords;
	}
	public Player(Date pdob, String pid, String pfName, String plName, String pCountry, int pRecords) {
		super();
		this.pdob = pdob;
		this.pid = pid;
		this.pfName = pfName;
		this.plName = plName;
		this.pCountry = pCountry;
		this.pRecords = pRecords;
	}
	public Player() {
		
	}
	@Override
	public String toString() {
		return "Player [pdob=" + pdob + ", pid=" + pid + ", pfName=" + pfName + ", plName=" + plName + ", pCountry="
				+ pCountry + ", pRecords=" + pRecords + "]";
	}
	
	

	

}
