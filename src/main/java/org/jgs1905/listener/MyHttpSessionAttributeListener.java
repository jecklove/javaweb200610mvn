package org.jgs1905.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 	session属性监听器
 * @author junki
 * @date 2020年6月10日
 */
@WebListener
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	/**
	 * 	属性添加
	 */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
    	
    	String name = event.getName();
    	Object value = event.getValue();
  
    	System.out.println("属性添加成功：" + name + "=" + value);
    }

    /**
     * 	属性删除
     */
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    	String name = event.getName();
    	Object value = event.getValue();
  
    	System.out.println("属性删除成功：" + name + "=" + value);
    	
    }

    /**
     * 	属性修改
     */
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
    	String name = event.getName();
    	Object value = event.getValue();
  
    	System.out.println("属性修改成功：" + name + "=" + value);
    }
	
}
