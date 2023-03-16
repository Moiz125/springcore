package annotationbased;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dept {
//	@Value("Software")
	@Value("#{new java.lang.String('Software')}")  // Spring object by Spring Expressing Language SpEL
	private String name;
	
	private Student student;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Dept(String name, Student student) {
		super();
		this.name = name;
		this.student = student;
	}
	public Dept(Student student) {
		super();
		this.student = student;
	}



	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		student.display();
		return "Dept [name=" + name +  "]";
	}

}
