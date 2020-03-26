package _03_Threaded_Reverse_Greeting;

public class Threader implements Runnable{
	int threadNum;
	Threader(int threadNum){
		this.threadNum = threadNum;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println(threadNum);
	if (threadNum <= 49) {
		Thread r5 = new Thread(new Threader(threadNum+1));
		r5.start();
		}
	}
}

