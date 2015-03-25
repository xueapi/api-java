package com.xueapi.life.weather.openweather;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.xueapi.util.HttpGetClient;

/*
 * <p>Title: Weather</p>
 * <p>Description: 中国气象局公共气象服务中心 - 接口请求类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-2-25</p>
 * @author: James
 * @version: 1.0
 */
public class Weather {
	
	private static final Log log = LogFactory.getLog(Weather.class);
	
	private static final String AppId = "xxxxxxxxxxxxxx";  //此处替换成你的AppId

	//密钥
	private static final String Private_Key = "xxxxxx_SmartWeatherAPI_xxxxxxx";  //此处替换成你的Private_Key

	public String getWeatherInfo(String areaid, String type, String date){
		String dateStr = "http://open.weather.com.cn/data/?areaid=" + areaid + "&type=" + type + "&date=" + date;
		//需要加密的数据
		String data = dateStr + "&appid=" + AppId;        
		String key = StandardURLEncoder.encoder(data, Private_Key);
		String url = dateStr + "&appid=" + AppId.substring(0, 6) + "&key=" + key;

		log.info("url = " + url);
		HttpGetClient client = new HttpGetClient();
		String content = client.getInfo(url);
		
		return content;

	}

}
