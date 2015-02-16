package eDigiClock;

public class ClockLogic implements ClockInterface {
	
	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	
	public ClockLogic (DigitalClockGUI clockIn){
		this.clockGUI = clockIn;
		
	}
	
	public void setAlarm (int hour, int minute){
		this.alarmHour = hour;
		this.alarmMinute = minute;
		
	}
	
	public void clearAlarm (){
		
	}

	@Override
	public void update(int hours, int minutes, int seconds) {
		// TODO Auto-generated method stub
		clockGUI.setTimeOnLabel(hours+ ":" + minutes + ":" + seconds);
	}
}
