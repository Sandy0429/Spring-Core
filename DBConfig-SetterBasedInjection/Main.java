// DBConfig/src/main/java/com/app/driver/Main.java
    package com.app.driver;
    
    import org.springframework.context.ConfigurableApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;
    
    import com.spring.app.DBConfig;
    import com.spring.app.EmployeeDAO;
     
    public class Main {
     
    	@SuppressWarnings("resource")
    	public static void main(String[] args) {
    	    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	    EmployeeDAO empDAO = (EmployeeDAO)context.getBean("employeeDAO");
    	    
    	    DBConfig dbConfig = empDAO.getDbConfig();
    	    
    	    System.out.println(dbConfig.getDriverName());
    	    System.out.println(dbConfig.getUrl());
    	    System.out.println(dbConfig.getUserName());
    	    System.out.println(dbConfig.getPassword());
    	    
    		context.close();
    	}
    }
