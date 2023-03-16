package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        ApplicationContext cox = new ClassPathXmlApplicationContext("autowiring.xml");
        
        LifeCycleMethods lcm = (LifeCycleMethods) cox.getBean("life");
        LifeCycleMethods2 lcm2 = (LifeCycleMethods2) cox.getBean("lcm2");
        System.out.println(lcm);
    }
}
