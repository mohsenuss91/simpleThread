class theThreads implements Runnable 
{
	int timesRun = 0; 
	public theThreads()
	{
	}
	public synchronized void run()
	{
		int temp = timesRun; 
		temp++;
		timesRun = temp; 
		System.out.println(timesRun);
	}
}