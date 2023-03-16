package com.springcore;

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

	@Value("#{lcm2s}")
	private List<Integer> id;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	@Value("#{T(java.lang.Math).PI}")
	private int pi;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [name=" + name + ", id=" + id + pi + "]";
	}

}
