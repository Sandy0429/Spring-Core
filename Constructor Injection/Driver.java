//exact file location--- constructorinjection/src/main/java/com/spring/app/Driver.java

   package com.spring.app;
    
    //import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;
   
    import java.util.Scanner;
    
    public class Driver {
        public static void main(String[] args) {
            
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            MemberShip memberShip = context.getBean("memberShipObj", MemberShip.class);
            System.out.println(memberShip);
        }
    }
