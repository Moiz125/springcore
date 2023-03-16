package annotationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="annotationbased")
public class javaConfig {

	@Bean(name={"student", "AnyNameWeCanUseHereToGetTheBeanInAppClass"}) 
	// WE CREATED THIS BEAN AS THEN AUTOWIRED IT TO THE BELOW CLASS TO INVOKE AND JOIN THE CONTRUCTOR
	public Student getStudent() {
		Student student= new Student();
		return student;
	}
	
	@Bean
	public Dept getDept() {
		//creating new Dept object
			Dept dept = new Dept(getStudent());
			return dept;
	}
}
