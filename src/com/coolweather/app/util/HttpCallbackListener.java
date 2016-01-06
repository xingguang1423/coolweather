package com.coolweather.app.util;

/**
 * HttpCallbackListener 接口回调服务返回的结果
 * @author Administrator
 *
 */
public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
	
}
