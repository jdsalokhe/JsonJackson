package com.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;


public class OpenWeatherMap {

	static final String URL_OpenWeatherMap_weather = "https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22";
	
	public static String getJsonResponse()
	{
		String weatherResponse = "";
		try {			

			URL url_weather = new URL(URL_OpenWeatherMap_weather);

			HttpURLConnection httpURLConnection = (HttpURLConnection) url_weather.openConnection();

			if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

				InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 8192);
				String line = null;
				while ((line = bufferedReader.readLine()) != null) {
					weatherResponse += line;
				}

				bufferedReader.close();
				 
			}
		} catch (Exception e) {
			//e.printStackTrace();
			Logger.getLogger(e.getMessage());
		}
		return weatherResponse;
	}
}
