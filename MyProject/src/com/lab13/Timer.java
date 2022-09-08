package com.lab13;

public class Timer implements Runnable {
	public static final long startTime = System.currentTimeMillis();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer a = new Timer();
		Thread t1 = new Thread(a,"T1");
		t1.start();
	}
	

	@Override
	public void run() {
		
		while(true) {
			long elapsedTime = System.currentTimeMillis() - startTime;
			long elapsedSeconds = elapsedTime / 1000;
			long sec = elapsedSeconds % 60;
			long elapsedMinutes = elapsedSeconds / 60;
			long min = elapsedMinutes % 60;
			long elapseHours = elapsedMinutes / 60;
			System.out.println(elapseHours+":"+min+":"+sec+"\n");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
