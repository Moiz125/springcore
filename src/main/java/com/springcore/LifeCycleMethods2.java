package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleMethods2 implements InitializingBean,DisposableBean {
	private String var;


	public LifeCycleMethods2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LifeCycleMethods2(String var) {
		super();
		this.var = var;
	}

	public String getVar() {
		return var;
	}
	
	public void setVar(String var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return "[var=" + var + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init called");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy called");
	}
	
}
