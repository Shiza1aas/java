Declaring Objects:

Object decleration is two step process:

1. Declaring a variable of a class type.
	
	Box new_box ;

	new_box is variable of class Box.

	new_box refer to an Object of class Box.

2. Now, to aquire physical copy of an object, you need to call new operator.

	new_box = new Box();

	new : It allocates physical memory of the object new_box and returns a
	reference to it.

	new_box is a variable which stores the address of Box(), but it is different
	from pointers. In C/C++ you can change the address of a pointer, but in Java you 
	can't.

 --> New allocates memory at run time.

 Assiging Object reference variables:

 Box b1 = new Box();

 Box b2 = b1;

 Now b2 points at the b1;


 				  Box					
 b1 ---------> | width	
               | height
 b2 ---------> | length

 b1 = null;
 
 b1 ---------> null
 				
 				  Box					
               | width	
               | height
 b2 ---------> | length


 So, Assiging one object to another means you are making a copy of the reference,
 not the object.


Accessing instance variable:

If instance variable is accessed outside the class in which it has been defined, it must 
be accessed by . operator.

// 

Parameters and arguments:

Parameters are variables associated with methods, which get values when the method is invoked.

Arguments are values which are passed during method call.

int fun(int par){};

fun(100);

par : a Parameter
100  : an argument.

In well-designed java codes, instance variables are accessed only through class methods.


Constructors:

Automatic initialization is done using Constructors.

Constructors don't return any values, because they return the object type 
themselves.

this keyword:

this is used to invoke the current object.

Argument passing:

Primitive types are passed by value.
Objects are passed by reference.



static variables are same for each object.

static methods:

1. These can directly call only static methods.
2. These can directly access only static variables.
3. No this or super in the case of static methods.

To call static methods from outside world, you need to use

classname.method();



// Interfaces onwards

An abstract type, which defines what Interfaces one class has to implement.

methods are declared without body.

These are rather implemented.

The implementations can be accessed via interface references just the way subclasses were referenced using 
superclasses.

variables in interfaces:

We can have variables in interfaces too. These are simply act as final variables.

one interface can inherit another.


Default interface methods:

default String getString()
{
	// body
}

The above method is a default method. It has been added in JDK 8, so that one can add his own implementation
to the interfaces.

In case of default interface methods, there is an issue of multiple inheritance. Let us consider an example:

interface A
{
	void hello();

	default void eat()
	{
		// A's default eat
	}
}


interface B
{
	void hello();

	default void eat()
	{
		// A's default eat
	}
}

class C implements A,B {
	public void hello()
	{
		// hello
	}

	// public void eat()
	// {
	// 	//  i am in C
	// }
}

So, what should C do in this case? Which eat() should it inherit?
It will through an error.

Let us consider a situation where one interface inherit another:

interface A
{
	void hello();

	default void eat()
	{
		System.out.println("I am in A's eat.");
		// A's default eat
	}
}


interface B extends A
{
	void hello();

	default void eat()
	{
		System.out.println("I am in B's eat.");
	}
}


class C implements A,B {
	public void hello()
	{
		// hello
	}

	// public void eat()
	// {
	// 	//  i am in C
	// }
}


What would happen here? C will use B's eat. If you want to use A's eat, you need to call

Exception handling
------------------

Exception is something which denotes an exceptional behaviour in you java code.

Java exception handling is managed by following 5 keywords:

1. try
2. catch
3. throw : To manually throw an exception, you need to use throw.
4. throws : To throw an exception by a method, you need to use throws.
5. finally


All exception are subclasses of Throwable class.

						Throwable
						/       \
                       /         \
                    Exception   Error
                        |
                        |
                 Runtime Exception

If you will not handle an exception, the default behaviour will be occured. It will show an error and your 
program will be terminated.

To stop this, you need to handle the exception by yourself.


All exceptions are subclasses of class exception.
-------------------------------------------------------
Multithreaded Programming.
-------------------------













