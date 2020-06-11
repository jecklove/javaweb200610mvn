package org.jgs1905.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * 	request生命周期监听器
 * @author junki
 * @date 2020年6月10日
 */
//@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("request初始化完毕");
    }
	
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("request销毁完毕");
    }
}
