package com.json;

import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Climate;
import com.pojo.ClimateParameter;
 


public class JsonParser {

	public static void main(String[] args) {
		Logger cLogger = Logger.getLogger("Log");
		try{
		//Fetch Json data from OpenWeatherMap Api
		String weatherResponse = OpenWeatherMap.getJsonResponse();		
		
		// Simple file logging Handler.
		FileHandler cFileHandler;
		
					//If FileHandler set true the we can append the logs
					cFileHandler = new FileHandler("City-log.log", false);
				cLogger.addHandler(cFileHandler);
	 
				// Print a brief summary of the Log Record in a human readable format.
					SimpleFormatter formatter = new SimpleFormatter();	
				cFileHandler.setFormatter(formatter);
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		//JSON from String to Object
		Climate citylist = mapper.readValue(weatherResponse.toString(), Climate.class);			 
		
		List<ClimateParameter> list = citylist.getList();	 
		
		long count = list.stream().filter(m->m.getName().toString().startsWith("T")).count();
		 
		cLogger.info("\nNumber of Cities with Parameter name starting with T: " + count+"\n");
		
		}catch (Exception e) {
			
			cLogger.info(e.getMessage());
		}
	}

}
