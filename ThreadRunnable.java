class ThreadRunnable implements Runnable {
	
	Thread t;
	ThreadRunnable()
	{
		t = new Thread(this,"shahjahan");
		t.start();
	}

	public void run()
	{
		System.out.println("I am in run of thread.");
		for (int i = 0 ; i < 5; i++) {
			
			System.out.println("Hello from " + i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e) {
				System.out.println("I got an Exception");
			}

		}
	}
}