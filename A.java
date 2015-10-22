interface A
{
	void hello();

	default void eat()
	{
		System.out.println("I am in A's eat.");
		// A's default eat
	}
}
