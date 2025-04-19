package tipo;

public sealed abstract class Clock permits BRLClock, USClock {
	protected int minute;
	
	protected int second;

	protected int hour;
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour >= 24) {
			this.hour = 24;
			}
		return;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >= 60) {
			this.minute = 60;
			}
		return;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second >= 60) {
			this.second = 60;
			}
		return;
	}
	
	private String format(int value) {
		
		return  value < 9 ? 
				"0"+ value 
				: String.valueOf(value);
	}
	public String getTime() {
				
		return format(hour)+ ":"
		+ format(minute)+":"
		+format(second);
	}

	
	abstract Clock convert(Clock clock);
	
}
