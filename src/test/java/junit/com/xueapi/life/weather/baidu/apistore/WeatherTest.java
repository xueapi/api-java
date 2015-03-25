package junit.com.xueapi.life.weather.baidu.apistore;

import junit.framework.TestCase;

import org.junit.Test;

import com.xueapi.life.weather.baidu.apistore.Weather;
import com.xueapi.life.weather.baidu.apistore.WeatherInfo;

public class WeatherTest extends TestCase{

	@Test
	public void testWeather(){
		// beijing 101010100
		Weather w = new Weather();
		WeatherInfo info = w.getWeatherInfoByCityCode("101010100");
		System.out.println("城市：" + info.getCity());
		System.out.println("城市拼音：" + info.getPinyin());
		System.out.println("城市编码：" + info.getCitycode());
		System.out.println("日期：" + info.getDate());
		System.out.println("发布时间：" + info.getTime());
		System.out.println("邮编：" + info.getPostCode());
		System.out.println("经度：" + info.getLongitude());
		System.out.println("维度：" + info.getLatitude());
		System.out.println("海拔：" + info.getAltitude());
		System.out.println("天气情况：" + info.getWeather());
		System.out.println("气温：" + info.getTemp());
		System.out.println("最低气温：" + info.getL_tmp());
		System.out.println("最高气温：" + info.getH_tmp());
		System.out.println("风向：" + info.getWD());
		System.out.println("风力：" + info.getWS());
		System.out.println("日出时间：" + info.getSunrise());
		System.out.println("日落时间：" + info.getSunset());
	}

}
