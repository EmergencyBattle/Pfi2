package eDigiClock;

import java.util.Calendar;

public class ClockThread extends Thread {

	
	private ClockInterface clockInterface;

	boolean isOn = true;
	private boolean running = true;
	
	int hours, minutes, seconds;
	
	public ClockThread (ClockInterface ci){
		this.clockInterface = ci;

	}
	
	@Override
	public void run(){
		while (running == true){

		
			try {
				Thread.sleep(900);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Calendar calendar = Calendar.getInstance();
			this.hours = calendar.get(Calendar.HOUR_OF_DAY);
			this.minutes = calendar.get(Calendar.MINUTE);
			this.seconds = calendar.get(Calendar.SECOND);		
			this.clockInterface.update(hours, minutes, seconds);
			
			}
	}
	
}
