class MainThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);

		t.setName("Shahjahan");
		System.out.println("Current thread after change: " + t);
	}
}