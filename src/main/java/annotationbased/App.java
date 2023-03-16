package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
	
//	Dept dept =  context.getBean("dept",Dept.class); //Simple method of getting object from bean class
	Dept dept =  context.getBean("getDept",Dept.class); // getting object from get method defined in 
												// javaConfig Class
//	System.out.print(dept);
	
	Student student = context.getBean("student",Student.class);
	student.display();

	}
}