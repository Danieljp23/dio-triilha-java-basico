package tipo;

public non-sealed class BRLClock extends Clock {

	@Override
	public String toString() {
		return "BRLClock []";
	}
	
	@Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case  USClock usClock -> {
                this.hour = usClock.getPeriodIndicator().equals("PM")
                    ? usClock.getHour() + 12
                    : usClock.getHour();
            }
            case  final BRLClock brClock -> {
                this.hour = brClock.getHour();
            }
           
        }

        return this;
    }

}
