package com.springcore;

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
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student std = (Student)context.getBean("student1");
//        Student std2 = (Student)context.getBean("student2");
//        System.out.println(std);
//        System.out.println(std2);
//        System.out.println(std.getDept().getName());
//        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
//        Test t = (Test)cont.getBean("test1");
//        System.out.println(t);
//        Test t1 = (Test)cont.getBean("product");
    
        AbstractApplicationContext cox = new ClassPathXmlApplicationContext("configlifecycle.xml");
        
//        LifeCycleMethods lcm = (LifeCycleMethods) cox.getBean("life");
//        LifeCycleMethods2 lcm2 = (LifeCycleMethods2) cox.getBean("lcm2");
//        System.out.println(lcm);
//        cox.registerShutdownHook();
        
        	Dept dept = cox.getBean("dept",Dept.class);
        	System.out.println(dept.hashCode());
        	Dept dept2 = cox.getBean("dept",Dept.class);
        	System.out.println(dept2.hashCode());
        	System.out.println(dept);
    }
}
