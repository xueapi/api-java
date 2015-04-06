package junit.com.xueapi.life.weather.haoservice;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.xueapi.life.weather.haoservice.Future;
import com.xueapi.life.weather.haoservice.SK;
import com.xueapi.life.weather.haoservice.Today;
import com.xueapi.life.weather.haoservice.Weather;
import com.xueapi.life.weather.haoservice.WeatherInfo;


/*
 * <p>Title: WeatherInfo</p>
 * <p>Description: haoservice天气预报 - Junit测试类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-2-25</p>
 * @author: James
 * @version: 1.0
 */
public class WeatherTest extends TestCase{
	
	@Test
	public void testWeatherXML(){
		Weather w = new Weather();
		WeatherInfo info = w.getWeatherInfo("长春");
		
		SK sk = info.getSk();
		System.out.println("当前温度：" + sk.getTemp());
		System.out.println("当前风向：" + sk.getWind_direction());
		System.out.println("当前风力：" + sk.getWind_strength());
		System.out.println("当前湿度：" + sk.getHumidity());
		System.out.println("更新时间：" + sk.getTime());
		
		Today today = info.getToday();

		System.out.println("");
		System.out.println("城市：" + today.getCity());
		System.out.println("日期：" + today.getDate_y());
		System.out.println("星期：" + today.getWeek());
		System.out.println("今日温度：" + today.getTemperature());
		System.out.println("今日天气：" + today.getWeather());
		System.out.println("风向风力：" + today.getWind());
		System.out.println("穿衣指数：" + today.getDressing_index());
		System.out.println("穿衣建议：" + today.getDressing_advice());
		System.out.println("紫外线强度：" + today.getUv_index());
		System.out.println("舒适度指数：" + today.getComfort_index());
		System.out.println("洗车指数：" + today.getWash_index());
		System.out.println("旅游指数：" + today.getTravel_index());
		System.out.println("晨练指数：" + today.getExercise_index());
		System.out.println("干燥指数：" + today.getDrying_index());
		
		List<Future> futures = info.getFutures();
		for(int i = 0; i < futures.size(); i++){
			Future f = futures.get(i);
			System.out.println("");
			System.out.println("日期：" + f.getDate());
			System.out.println("温度：" + f.getTemperature());
			System.out.println("天气：" + f.getWeather());
			System.out.println("风向风力：" + f.getWind());
			System.out.println("星期：" + f.getWeek());
		}
	}
}
