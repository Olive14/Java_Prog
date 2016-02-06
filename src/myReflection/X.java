package myReflection;

public class X {
	private String str;

	/**
	 * Set field value if parameter is not null.
	 *
	 * @param str
	 * @throws NullPointerException
	 *             if parameter is null.
	 */
	public X(String str) {
		final String CONSTRUCTOR_INFO = "class X constructor with String parameter";
		if (null == str) {
			throw new NullPointerException("Parameter is null. @" + CONSTRUCTOR_INFO);
		}
		this.str = str;
	}

	/**
	 * If created X object without parameter, set default value.
	 */
	public X() {
		this("Hello, ");
	}

	/**
	 * Append field "str" and String parameter "param".
	 * This method calls executeAppendString.
	 *
	 * @param param
	 * @return appended String object.
	 * @throws NullPointerException
	 *             if parameter is null.
	 */
	public String appendString(String param) {
		final String METHOD_NAME = "X #appendString with String parameter";
		if (null == param) {
			throw new NullPointerException("Parameter is null. @" + METHOD_NAME);
		}

		return executeAppendString(param);
	}

	/**
	 * Append field "str" and String parameter "param".
	 *
	 * @param param
	 * @return appended String object.
	 */
	private String executeAppendString(String param) {
		final String METHOD_NAME = "X #executeAppendString with String parameter";

		return str += param;
	}
}
