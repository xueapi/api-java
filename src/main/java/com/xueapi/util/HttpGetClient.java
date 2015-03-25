package com.xueapi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * <p>Title: HttpGetClient</p>
 * <p>Description: 学api网 - 客户端HTTP请求类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-2-25</p>
 * @author: James
 * @version: 1.0
 */
public class HttpGetClient {
	
	private static final Log log = LogFactory.getLog(HttpGetClient.class);
	
	private static String charset = "utf-8";

	public String getInfo(String url) {
		return getInfo(url, charset);
	}

	public String getInfo(String url, String charset) {

		HttpClient client = new HttpClient();
		GetMethod httpGet = null;
		httpGet = new GetMethod(url);
		StringBuffer buffer = null;
		try {
			client.executeMethod(httpGet);
			InputStream in = httpGet.getResponseBodyAsStream();
			InputStreamReader inputStreamReader = new InputStreamReader(in, charset);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			// 读取返回结果
			buffer = new StringBuffer();
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}

			bufferedReader.close();
			inputStreamReader.close();
			in.close();
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			httpGet.releaseConnection();
		}
		
		String content = buffer.toString();
		log.info("content = " + content);
		
		return buffer.toString();
	}

}
