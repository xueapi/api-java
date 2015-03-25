package com.xueapi.life.weather.baidu.apistore;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONObject;
import com.xueapi.util.HttpGetClient;

/*
 * <p>Title: Weather</p>
 * <p>Description: 百度API Store天气预报 - 接口请求类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-3-25</p>
 * @author: James
 * @version: 1.0
 */
public class Weather {

	public WeatherInfo getWeatherInfoByCityCode(String cityId) {
		String url = "http://apistore.baidu.com/microservice/weather?cityid=" + cityId;
		HttpGetClient client = new HttpGetClient();
		String json = client.getInfo(url);

		Map map = JSONObject.parseObject(json, Map.class);
		WeatherInfo info = JSONObject.parseObject(map.get("retData").toString(), WeatherInfo.class);
		
		return info;
	}

}
