import java.util.*;
class theThreads implements Runnable 
{
	volatile int timesRun = 0; 
	public theThreads()
	{
	}
	public void run()
	{
		timesRun++; 
		System.out.println(timesRun);
	}
}