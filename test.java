import java.util.Scanner;
import java.util.Random; 

class test {
	public static void main(String args[]) throws java.lang.InterruptedException
	{
		System.out.println("Number of threads:");

		Scanner in = new Scanner(System.in);
		int numThreads = in.nextInt();

		theThreads testThread = new theThreads(); 
		Thread[] array = new Thread[numThreads];
		for (int i = 0; i < numThreads; i++)
		{
			array[i] = new Thread(testThread);
		}

		for(int i = 0 ; i < numThreads; i++)
		{
			array[i].start(); 
		}

		for (int i = 0; i < numThreads; i++)
		{
			array[i].join(); 
		}

	}
}
