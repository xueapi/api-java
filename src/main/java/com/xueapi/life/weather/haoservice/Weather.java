package com.xueapi.life.weather.haoservice;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.xueapi.util.HttpGetClient;

/*
 * <p>Title: Weather</p>
 * <p>Description: haoservice天气预报 - 请求解析类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-04-06</p>
 * @author: James
 * @version: 1.0
 */

public class Weather {
	
	private static String key = "c8a6f4b5a22340f08014e245ac18d611";

	public WeatherInfo getWeatherInfo(String cityName) {
		try {
			cityName = URLEncoder.encode(cityName,"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "http://apis.haoservice.com/weather?cityname=" + cityName + "&key=" + key;
		HttpGetClient client = new HttpGetClient();
		String json = client.getInfo(url);

		Map map = JSONObject.parseObject(json, Map.class);
		Map result = JSONObject.parseObject(map.get("result").toString(), Map.class);
		
		SK sk = JSONObject.parseObject(result.get("sk").toString(), SK.class);
		Today today = JSONObject.parseObject(result.get("today").toString(), Today.class);
		List<Future> list = new ArrayList<Future>();
		List futures = JSONObject.parseObject(result.get("future").toString(), List.class);
		for(int i = 0; i < futures.size(); i++){
			Future f = JSONObject.parseObject(futures.get(i).toString(), Future.class);
			list.add(f);
		}
		WeatherInfo info = new WeatherInfo();
		info.setFutures(list);
		info.setSk(sk);
		info.setToday(today);
		
		return info;
	}

}
