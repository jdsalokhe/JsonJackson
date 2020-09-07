package com.pojo ;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("list")
public class ClimateParameter
{
	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
    private String name;

	@JsonProperty("coord")
    private Coord coord;

	@JsonProperty("main")
    private Main main;

	@JsonProperty("dt")
    private int dt;

	@JsonProperty("wind")
    private Wind wind;

	@JsonProperty("rain")
    private Rain rain;

	@JsonProperty("clouds")
    private Clouds clouds;

    private List<Weather> weather;

    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCoord(Coord coord){
        this.coord = coord;
    }
    public Coord getCoord(){
        return this.coord;
    }
    public void setMain(Main main){
        this.main = main;
    }
    public Main getMain(){
        return this.main;
    }
    public void setDt(int dt){
        this.dt = dt;
    }
    public int getDt(){
        return this.dt;
    }
    public void setWind(Wind wind){
        this.wind = wind;
    }
    public Wind getWind(){
        return this.wind;
    }
    public void setRain(Rain rain){
        this.rain = rain;
    }
    public Rain getRain(){
        return this.rain;
    }
    public void setClouds(Clouds clouds){
        this.clouds = clouds;
    }
    public Clouds getClouds(){
        return this.clouds;
    }
    public void setWeather(List<Weather> weather){
        this.weather = weather;
    }
    public List<Weather> getWeather(){
        return this.weather;
    }
}
 
