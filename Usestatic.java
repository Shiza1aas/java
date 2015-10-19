class Usestatic {

	static int a = 3;
    static int b;


	static {
		System.out.println("I am in static");

		b = a * 3;
	}

	static void cal(int x)
	{
		System.out.println("x is " + x);
		System.out.println("a is " + a);
		System.out.println("b is " + b);


	}


	public static void main(String[] args) {
		// cal(34);
	}
}