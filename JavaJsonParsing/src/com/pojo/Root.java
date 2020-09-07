package com.pojo ;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("root")
public class Root
{
	@JsonProperty("cod")
    private String cod;

	@JsonProperty("calctime")
    private double calctime;

	@JsonProperty("cnt")
    private int cnt;

    private List<ClimateParameter> list;

    public void setCod(String cod){
        this.cod = cod;
    }
    public String getCod(){
        return this.cod;
    }
    public void setCalctime(double calctime){
        this.calctime = calctime;
    }
    public double getCalctime(){
        return this.calctime;
    }
    public void setCnt(int cnt){
        this.cnt = cnt;
    }
    public int getCnt(){
        return this.cnt;
    }
    public void setList(List<ClimateParameter> list){
        this.list = list;
    }
    public List<ClimateParameter> getList(){
        return this.list;
    }
}
