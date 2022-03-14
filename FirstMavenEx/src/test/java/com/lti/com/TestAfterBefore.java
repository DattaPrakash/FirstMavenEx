package com.lti.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;



class TestAfterBefore {

	@Test
	public void TestCal() 
	{
		Calculator c=new Calculator();
		int r=c.add(300,200);
		Assertions.assertEquals(500,r);

	}

}
