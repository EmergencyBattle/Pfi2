package eDigiClock;

import java.util.Calendar;

public class ClockThread extends Thread {

	
	private ClockInterface clockInterface;

	private boolean running = true;
	
	public ClockThread (ClockInterface ci){
		this.clockInterface = ci;

	}
	
	@Override
	public void run(){
		while (running == true){

			Calendar now = Calendar.getInstance();
			clockInterface.update(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));	
			
			try {
				Thread.sleep(900);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
	}
	
}
