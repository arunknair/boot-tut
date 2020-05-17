package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalcImpl implements MethodReplacer{

	@Override
	public Object reimplement(Object o, Method m, Object[] params) throws Throwable {
//		System.out.println("The version is " + m.getName());
		System.out.println("New interest Calc 2020");
		return o;
	}

}
