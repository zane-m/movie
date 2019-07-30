package com.neuedu.movie.model.bean;

import java.sql.Timestamp;

public class Play {
	
	private int playid;
	private int mid;
	private Timestamp playtime;
	private Float playprice;
	private int cinemaid;
	public int getPlayid() {
		return playid;
	}
	public void setPlayid(int playid) {
		this.playid = playid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public Timestamp getPlaytime() {
		return playtime;
	}
	public void setPlaytime(Timestamp playtime) {
		this.playtime = playtime;
	}
	public Float getPlayprice() {
		return playprice;
	}
	public void setPlayprice(Float playprice) {
		this.playprice = playprice;
	}
	public int getCinemaid() {
		return cinemaid;
	}
	public void setCinemaid(int cinemaid) {
		this.cinemaid = cinemaid;
	}
	

}
