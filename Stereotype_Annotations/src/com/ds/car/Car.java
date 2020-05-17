package com.ds.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.engine.Engine;

@Component
public class Car {
	@Autowired
	private Engine engine;
	
	public void print() {
		System.out.println("model : " + engine.getModel());
	}
}
