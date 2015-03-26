package com.xueapi.life.weather.k780;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSONObject;
import com.xueapi.util.HttpGetClient;

/*
 * <p>Title: Weather</p>
 * <p>Description: k780天气预报 - 接口请求类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-3-26</p>
 * @author: James
 * @version: 1.0
 */
public class Weather {
	
	private static final Log log = LogFactory.getLog(Weather.class);
	
	private static final String sign = "b59bc3ef6191eb9f747dd4e83c99f2a4";

	private String getWeatherInfo(String cityId, String app, String format){
		String url = "http://api.k780.com:88/?app=" + app + "&weaid=" + cityId + "&appkey=10003&sign=" + sign + "&format=" + format;
		
		log.info("url = " + url);
		HttpGetClient client = new HttpGetClient();
		String content = client.getInfo(url);
		
		return content;

	}

	public List<WeatherInfo> getWeatherInfoJson(String cityId, String app, String format){
		List<WeatherInfo> list = new ArrayList<WeatherInfo>();
		String json = this.getWeatherInfo(cityId, app, format);

		Map map = JSONObject.parseObject(json, Map.class);
		List weatherInfoList = JSONObject.parseObject(map.get("result").toString(), List.class);
		for (int i = 0; i < weatherInfoList.size(); i++) {
			WeatherInfo info = JSONObject.parseObject(weatherInfoList.get(i).toString(), WeatherInfo.class);
			list.add(info);
		}
		return list;
	}

	public List<WeatherInfo> getWeatherInfoXML(String cityId, String app, String format){
		List<WeatherInfo> list = new ArrayList<WeatherInfo>();
		String xml = this.getWeatherInfo(cityId, app, format);
		try {
			// 将xml格式的字符串转换成Document对象
			Document doc = DocumentHelper.parseText(xml);
			// 获取根节点
			Element root = doc.getRootElement();
			// 获取根节点下的所有元素
			List children = root.elements();
			// 循环所有子元素
			if (children != null && children.size() == 2) {
				Element success = (Element) children.get(0);
				if("1".equals(success.getTextTrim())){
					Element result = (Element) children.get(1);
					List items = result.elements();
					for (int i = 0; i < items.size(); i++) {
						Element item = (Element) items.get(i);
						List weatherInfos = item.elements();
						Map<String, String> map = new HashMap<String, String>();
						for (int j = 0; j < weatherInfos.size(); j++) {
							Element weatherInfo = (Element) weatherInfos.get(j);
							map.put(weatherInfo.getName(), weatherInfo.getTextTrim());
							//System.out.println(weatherInfo.getName() + "：" + weatherInfo.getTextTrim());
						}
						WeatherInfo info = new WeatherInfo();
						info.setWeaid(map.get("weaid"));
						info.setDays(map.get("days"));
						info.setWeek(map.get("week"));
						info.setCityno(map.get("cityno"));
						info.setCitynm(map.get("citynm"));
						info.setCityid(map.get("cityid"));
						info.setTemperature(map.get("temperature"));
						info.setHumidity(map.get("humidity"));
						info.setWeather(map.get("weather"));
						info.setWeather_icon(map.get("weather_icon"));
						info.setWeather_icon1(map.get("weather_icon1"));
						info.setWind(map.get("wind"));
						info.setWinp(map.get("winp"));
						info.setTemp_high(map.get("temp_high"));
						info.setTemp_low(map.get("temp_low"));
						info.setHumi_high(map.get("humi_high"));
						info.setHumi_low(map.get("humi_low"));
						info.setWeatid(map.get("weatid"));
						info.setWeatid1(map.get("weatid1"));
						info.setWindid(map.get("windid"));
						info.setWinpid(map.get("winpid"));
						list.add(info);
					}
				}
			}
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
}
