
interface B extends A
{
	void hello();

	default void eat()
	{
		System.out.println("I am in B's eat.");
	}
	// A.super.eat();

}
