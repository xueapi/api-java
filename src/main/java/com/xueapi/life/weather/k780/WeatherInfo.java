package com.xueapi.life.weather.k780;

import java.io.Serializable;

/*
 * <p>Title: WeatherInfo</p>
 * <p>Description: k780天气预报 - 天气信息类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-2-25</p>
 * @author: James
 * @version: 1.0
 */
public class WeatherInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String weaid;	//城市气象编号
	
	private String days;	//日期
	
	private String week;	//星期
	
	private String cityno;	//城市/地区英文
	
	private String citynm;	//城市/地区
	
	private String cityid;	//气象编号
	
	private String temperature;	//温度
	
	private String humidity;	//湿度
	
	private String weather;	//天气
	
	private String weather_icon;	//天气图标(目录b/c/d/n供使用)
	
	private String weather_icon1;	//天气图标1(目录b/c/d/n供使用)
	
	private String wind;	//风向
	
	private String winp;	//内力
	
	private String temp_high;	//最高温度
	
	private String temp_low;	//最低温度
	
	private String humi_high;	//最高湿度
	
	private String humi_low;	//最低湿度
	
	private String weatid;	//天气ID 详见:http://api.k780.com:88/?app=weather.wtype&format=xml
	
	private String weatid1;	//天气ID1 详见:http://api.k780.com:88/?app=weather.wtype&format=xml
	
	private String windid;	//风向ID
	
	private String winpid;	//风力ID

	public String getWeaid() {
		return weaid;
	}

	public void setWeaid(String weaid) {
		this.weaid = weaid;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getCityno() {
		return cityno;
	}

	public void setCityno(String cityno) {
		this.cityno = cityno;
	}

	public String getCitynm() {
		return citynm;
	}

	public void setCitynm(String citynm) {
		this.citynm = citynm;
	}

	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWeather_icon() {
		return weather_icon;
	}

	public void setWeather_icon(String weather_icon) {
		this.weather_icon = weather_icon;
	}

	public String getWeather_icon1() {
		return weather_icon1;
	}

	public void setWeather_icon1(String weather_icon1) {
		this.weather_icon1 = weather_icon1;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getWinp() {
		return winp;
	}

	public void setWinp(String winp) {
		this.winp = winp;
	}

	public String getTemp_high() {
		return temp_high;
	}

	public void setTemp_high(String temp_high) {
		this.temp_high = temp_high;
	}

	public String getTemp_low() {
		return temp_low;
	}

	public void setTemp_low(String temp_low) {
		this.temp_low = temp_low;
	}

	public String getHumi_high() {
		return humi_high;
	}

	public void setHumi_high(String humi_high) {
		this.humi_high = humi_high;
	}

	public String getHumi_low() {
		return humi_low;
	}

	public void setHumi_low(String humi_low) {
		this.humi_low = humi_low;
	}

	public String getWeatid() {
		return weatid;
	}

	public void setWeatid(String weatid) {
		this.weatid = weatid;
	}

	public String getWeatid1() {
		return weatid1;
	}

	public void setWeatid1(String weatid1) {
		this.weatid1 = weatid1;
	}

	public String getWindid() {
		return windid;
	}

	public void setWindid(String windid) {
		this.windid = windid;
	}

	public String getWinpid() {
		return winpid;
	}

	public void setWinpid(String winpid) {
		this.winpid = winpid;
	}

}
