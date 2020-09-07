package com.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Climate {
	
	@JsonProperty("cod")
	private String cod;
	
	@JsonProperty("calctime")
	private double calctime;
	
	@JsonProperty("cnt")
	private int cnt;
	
	@JsonProperty("list")
	private List<ClimateParameter> climatedata;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getCalctime() {
		return calctime;
	}

	public void setCalctime(double calctime) {
		this.calctime = calctime;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public List<ClimateParameter> getList() {
		return climatedata;
	}

	public void setList(List<ClimateParameter> climatedata) {
		this.climatedata = climatedata;
	}

}
