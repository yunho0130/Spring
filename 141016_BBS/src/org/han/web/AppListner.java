package org.han.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.han.dao.MP3BBSDAOImpl;
import org.han.service.MP3Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Lifecycle Listener implementation class AppListner
 *
 */
@WebListener
public class AppListner implements ServletContextListener {
	
	private static Logger logger = LoggerFactory.getLogger("AppListener");

    /**
     * Default constructor. 
     */
    public AppListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	ServletContext ctx = event.getServletContext();
    	
    	for(int i = 0; i < 10; i++){
    		
    		logger.info("......................" + i);
    		
    	}
    	
    	//ctx.setAttribute("timeDAO", new TimeDAO());
    	
    	MP3Service service = new MP3Service();
    	service.setDao(new MP3BBSDAOImpl());
    	ctx.setAttribute("MP3Service", service);
    	
    }
	
}
