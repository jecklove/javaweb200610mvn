package org.jgs1905.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 	application生命周期监听器
 * @author junki
 * @date 2020年6月10日
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	/**
	 * application初始化完毕
	 */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("application创建了");
    	sce.getServletContext().setAttribute("bp", sce.getServletContext().getContextPath());
    }
	
    /**
     * application销毁完毕
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("application销毁了");
    }

}
