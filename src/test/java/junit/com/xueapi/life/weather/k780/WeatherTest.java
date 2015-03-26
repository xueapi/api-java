package junit.com.xueapi.life.weather.k780;

import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.xueapi.life.weather.k780.Weather;
import com.xueapi.life.weather.k780.WeatherInfo;

/*
 * <p>Title: WeatherInfo</p>
 * <p>Description: k780天气预报 - Junit测试类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-2-25</p>
 * @author: James
 * @version: 1.0
 */
public class WeatherTest extends TestCase{
	
	private static final Log log = LogFactory.getLog(WeatherTest.class);
	
	@Test
	public void testWeatherXML(){
		// beijing 1
		Weather w = new Weather();
		List<WeatherInfo> list = w.getWeatherInfoXML("1", "weather.future", "xml");
		printInfo(list);
	}
	
	@Test
	public void testWeatherJson(){
		// beijing 1
		Weather w = new Weather();
		List<WeatherInfo> list = w.getWeatherInfoJson("1", "weather.future", "json");
		printInfo(list);
	}
	
	public void printInfo(List<WeatherInfo> list){
		for (int i = 0; i < list.size(); i++) {
			WeatherInfo info = list.get(i);
			System.out.println("第"+(i+1)+"天天气预报：");
			System.out.println("城市气象编号：" + info.getWeaid());
			System.out.println("日期：" + info.getDays());
			System.out.println("星期：" + info.getWeek());
			System.out.println("城市/地区英文：" + info.getCityno());
			System.out.println("城市/地区：" + info.getCitynm());
			System.out.println("气象编号：" + info.getCityid());
			System.out.println("温度：" + info.getTemperature());
			System.out.println("湿度：" + info.getHumidity());
			System.out.println("天气：" + info.getWeather());
			System.out.println("天气图标(目录b/c/d/n供使用)：" + info.getWeather_icon());
			System.out.println("天气图标1(目录b/c/d/n供使用)：" + info.getWeather_icon1());
			System.out.println("风向：" + info.getWind());
			System.out.println("风力：" + info.getWinp());
			System.out.println("最高温度：" + info.getTemp_high());
			System.out.println("最低温度：" + info.getTemp_low());
			System.out.println("最高湿度：" + info.getHumi_high());
			System.out.println("最低湿度：" + info.getHumi_low());
			System.out.println("天气ID：" + info.getWeatid());
			System.out.println("天气ID1：" + info.getWeatid1());
			System.out.println("风向ID：" + info.getWindid());
			System.out.println("风力ID：" + info.getWinpid());
			System.out.println("");
		}
	}

}
