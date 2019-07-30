package com.neuedu.movie.model.bean;

import java.sql.Date;

public class Movie {
	
	private int mid;
	private String mname;
	private String minfo;
	private int mlong;
	private String mkind;
	private String mlanguage;
	private String meffect;
	private String mpic;
	private String mvedio;
	private Date mstart;
	private Date mend;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMinfo() {
		return minfo;
	}
	public void setMinfo(String minfo) {
		this.minfo = minfo;
	}
	public int getMlong() {
		return mlong;
	}
	public void setMlong(int mlong) {
		this.mlong = mlong;
	}
	public String getMkind() {
		return mkind;
	}
	public void setMkind(String mkind) {
		this.mkind = mkind;
	}
	public String getMlanguage() {
		return mlanguage;
	}
	public void setMlanguage(String mlanguage) {
		this.mlanguage = mlanguage;
	}
	public String getMeffect() {
		return meffect;
	}
	public void setMeffect(String meffect) {
		this.meffect = meffect;
	}
	public String getMpic() {
		return mpic;
	}
	public void setMpic(String mpic) {
		this.mpic = mpic;
	}
	public String getMvedio() {
		return mvedio;
	}
	public void setMvedio(String mvedio) {
		this.mvedio = mvedio;
	}
	public Date getMstart() {
		return mstart;
	}
	public void setMstart(Date mstart) {
		this.mstart = mstart;
	}
	public Date getMend() {
		return mend;
	}
	public void setMend(Date mend) {
		this.mend = mend;
	}
	

}
