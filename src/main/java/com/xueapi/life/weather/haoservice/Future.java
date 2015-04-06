package com.xueapi.life.weather.haoservice;

import java.io.Serializable;

/*
 * <p>Title: Weather</p>
 * <p>Description: haoservice天气预报 - 天气预报信息类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-04-06</p>
 * @author: James
 * @version: 1.0
 */

public class Future implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*今日温度*/
	private String temperature;
	
	/*今日天气*/
	private String weather;
	
	/*天气唯一标识*/
	private WeatherId weather_id;
	
	private String wind;
	
	private String week;
	
	private String date;

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public WeatherId getWeather_id() {
		return weather_id;
	}

	public void setWeather_id(WeatherId weather_id) {
		this.weather_id = weather_id;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
