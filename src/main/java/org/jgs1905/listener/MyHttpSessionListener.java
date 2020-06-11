package org.jgs1905.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 	session生命周期监听器
 * @author junki
 * @date 2020年6月10日
 */
//@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("session被创建");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("session被销毁");
    }
	
}
