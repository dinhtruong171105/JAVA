package thread_object;

import java.io.IOException;

public class HelloWorld extends Thread {
	@Override
	public void run() {
		System.out.println(" start thread");
		long sum = 0L;
		for (long i = 0L; i < 10000000000L; i++) {
			sum += i;
		}
		System.out.println(" end thread");
// TODO Auto-generated method stub
	}

	public static void main(String[] args) throws IOException {
		int MAX = 4;
		for (int i = 0; i < MAX; i++) {
			(new HelloWorld()).start();
		}
		System.out.println("finish");
	}
}