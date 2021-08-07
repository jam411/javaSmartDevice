import java.util.Random;

public class AirCleaner extends PowerDevice {
	public static final int HUMI = 0;
	public static final int DEHUMI = 1;

	int remaining;
	int state;

	public AirCleaner(int dI){
		power = false;
		deviceId = dI;
		deviceName = "AirCleaner";
		// random remaining
		Random random = new Random();
		remaining = random.nextInt(100);
		state = HUMI;
		System.out.println("Constructor: "+super.getStatus()+" Remain:"+remaining+" State:"+state);
	}

    public String getStatus() {
        if(state==HUMI){
            return (super.getStatus()+" Remain:"+remaining+" State:"+state);
    	}else{
            return (super.getStatus()+" Remain:"+remaining+" State:"+state);
        }
	}

	public void humidification() {
		state = HUMI;
		// random remaining
		Random random = new Random();
		remaining = random.nextInt(100);
		if(remaining<=20){
			System.out.println("Notice! Water Remaining:"+remaining);
		}
	}

	public void dehumidification() {
		state = DEHUMI;
	}
}

