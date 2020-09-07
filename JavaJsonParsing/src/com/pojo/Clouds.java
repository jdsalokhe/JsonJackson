package com.pojo ;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("clouds")
public class Clouds
{
	@JsonProperty("all")
    private int all;

    public void setAll(int all){
        this.all = all;
    }
    public int getAll(){
        return this.all;
    }
}


