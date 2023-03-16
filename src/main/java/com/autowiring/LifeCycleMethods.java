package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class LifeCycleMethods {
	private String var;
	@Autowired
	private LifeCycleMethods2 lcm2;
	
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public LifeCycleMethods(String var, LifeCycleMethods2 lcm2) {
		super();
		this.var = var;
		this.lcm2 = lcm2;
	}

	public LifeCycleMethods2 getLcm2() {
		return lcm2;
	}
	
	public void setLcm2(LifeCycleMethods2 lcm2) {
		this.lcm2 = lcm2;
	}


	@Override
	public String toString() {
		return "LifeCycleMethods [var=" + var + ","+ lcm2 + "]";
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
}
