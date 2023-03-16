package com.springcore;

import java.util.List;

public class LifeCycleMethods {
	private String var;
	private LifeCycleMethods2 lcm2;
	private List<String> str;
	
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public LifeCycleMethods(String var,LifeCycleMethods2 lcm2,List<String> str) {
		super();
		this.var = var;
		this.lcm2 = lcm2;
		this.str = str;
	}

	public LifeCycleMethods2 getLcm2() {
		return lcm2;
	}

	public void setLcm2(LifeCycleMethods2 lcm2) {
		this.lcm2 = lcm2;
	}


	@Override
	public String toString() {
		return "LifeCycleMethods [var=" + var + ","+ lcm2 + " "+str+ "]";
	}

	public LifeCycleMethods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LifeCycleMethods(LifeCycleMethods2 lcm2) {
		super();
		this.lcm2 = lcm2;
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getStr() {
		return str;
	}

	public void setStr(List<String> str) {
		this.str = str;
	}

	public void init() {
		System.out.println("init called");
	}
	public void destroy() {
		System.out.println("destroy called");
	}
}
