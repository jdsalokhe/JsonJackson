package com.pojo ;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("wind")
public class Wind
{
	@JsonProperty("speed")
    private double speed;

	@JsonProperty("deg")
    private double deg;
    
	@JsonProperty("var_beg")
    private int var_beg;
    
	@JsonProperty("var_end")
    private int var_end;

    public int getVar_beg() {
		return var_beg;
	}
	public void setVar_beg(int var_beg) {
		this.var_beg = var_beg;
	}
	public int getVar_end() {
		return var_end;
	}
	public void setVar_end(int var_end) {
		this.var_end = var_end;
	}
	public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setDeg(double deg){
        this.deg = deg;
    }
    public double getDeg(){
        return this.deg;
    }
}


