package com.xueapi.life.weather.haoservice;

import java.io.Serializable;

/*
 * <p>Title: Weather</p>
 * <p>Description: haoservice天气预报 - 天气唯一标识信息类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: XUEAPI.COM</p>
 * <p>Create at: 2015-04-06</p>
 * @author: James
 * @version: 1.0
 */

/*天气唯一标识*/
public class WeatherId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*天气标识00：晴*/
	private String fa;

	/*天气标识53：霾 如果fa不等于fb，说明是组合天气*/
	private String fb;

	public String getFa() {
		return fa;
	}

	public void setFa(String fa) {
		this.fa = fa;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}
}
