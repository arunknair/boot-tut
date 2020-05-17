package com.ds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.car.Car;

public class CLient {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
			Car c = (Car)context.getBean("car");
			c.print();
		}
}
