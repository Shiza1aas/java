class BoxDemo
{
	int width;
	int height;
	int length;
}


class Box {
	
	public static void main(String[] args) {

		BoxDemo b1 = new BoxDemo();
		BoxDemo b2 = b1;


		System.out.println("after: b2: " + b2);
		b1 = null;
		System.out.println("before: b2:  " + b2);


	}
}