package com.springcore;

import java.util.List;

public class Test {
	private int var1;
	private String var2;
	private Dept dept;
	private List<String> list;
	private int one;
	private int two;

	public Test(int var1, String var2, Dept dept, List<String> list) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.dept = dept;
		this.list = list;
	}

//	public int sum(int one, int two) {
//
//		return one + two;
//	}

	public Test(int one, int two) {
		System.out.print(one*two);
	}

	@Override
	public String toString() {
		return this.var1 + "," + this.var2 + "," + this.dept + "," + this.list;
	}

}
