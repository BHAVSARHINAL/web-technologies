package form;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class firstlistener implements ServletContextListener {

    public firstlistener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("this is servlet listner contex distroyed ");
    	
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	  System.out.println("this is servlet listner context initialized ");
    }
	
}
