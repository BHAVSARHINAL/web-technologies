package form;

import javax.servlet.ServletContextEvent;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class servletListner implements ServletContextListener {

   
    public servletListner() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	
    	System.out.println("servlet distroy");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("servlet initilized");
    }
	
}
