package com.xueapi.life.weather.haoservice;

import java.io.Serializable;
import java.util.List;

/*
 * <p>Title: WeatherInfo</p>
 * <p>Description:haoservice天气预报 - 天气信息类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-04-06</p>
 * @author: James
 * @version: 1.0
 */
public class WeatherInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Future> futures;	//天气预报
	
	private SK sk;	//今日天气实况
	
	private Today today;	//今日天气信息

	public List<Future> getFutures() {
		return futures;
	}

	public void setFutures(List<Future> futures) {
		this.futures = futures;
	}

	public SK getSk() {
		return sk;
	}

	public void setSk(SK sk) {
		this.sk = sk;
	}

	public Today getToday() {
		return today;
	}

	public void setToday(Today today) {
		this.today = today;
	}
}
