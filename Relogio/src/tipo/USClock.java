package tipo;

public non-sealed class USClock extends Clock{

	private String periodIndicator;
	
	
	
	public void setHour(int hour) {
		setAfterMiday();
		if((hour >= 12) && (hour <= 24)) {
			setBeforeMiday();	
			this.hour = 12;
			}
		if(hour >=24) {
			this.hour = 0;
		}else {
			this.hour = hour;
		}
		return;
	}

	public String getPeriodIndicator() {
		return periodIndicator;
	}

	public void setAfterMiday() {
		
		this.periodIndicator = "AM";
	}
	
	public void setBeforeMiday() {
		
		this.periodIndicator="PM";
	}
	
	
	@Override
	Clock convert(Clock clock) {
	  this.second = clock.getSecond();
	  this.minute = clock.getMinute();
		
		switch (clock) {
        case  USClock usClock -> {
            this.hour = usClock.hour;
            this.periodIndicator = usClock.getPeriodIndicator();
               
        }
        case  final BRLClock brClock -> {
            this.setHour(brClock.getHour());
        }
       
    }
		return this;
	}
	
	public String getTime() {
		return super.getTime() + "  " + this.periodIndicator;
	}
}
