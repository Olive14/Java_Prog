package myReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// Create object.
		X x = new X();

		// Get Class object.
		Class clazz = x.getClass();

		// Get Method object with Class object.
		Method method = null;
		try {
			method = clazz.getDeclaredMethod("appendString",
					String.class);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		// Set accessible true if method is not public method.
		if (!method.isAccessible()) {
			method.setAccessible(true);
		}

		// Invoke method with reflection.
		try {
			String result = (String) method.invoke(x, (Object)null);
			System.out.println(result);
		} catch (NullPointerException e) {
			System.out.println("ぬるぽ");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
//			e.printStackTrace();
			System.out.println(e.getTargetException());
		}

	}

}
