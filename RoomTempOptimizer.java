public class RoomTempOptimizer extends Optimizer{
	private int temperature;
	private int humidity;

	public RoomTempOptimizer(){
		temperature = 0;
		humidity = 0;
		System.out.println("Constructor: RoomTempOptimizer");
	}

	public void getMeter(Meter m){
		temperature = m.getTemperature();
		humidity = m.getHumidity();
		System.out.println("RoomTemp getMeter: temperature:"+temperature+" humidity:"+humidity);
	}

	public void tempOptimize(AirCleaner acl, AirConditioner aco, Window w){
		// Window Optim
		w.close();
		
        // AirCleaner Optim
        if(humidity>60){
            acl.powerOn();
            acl.dehumidification();
        }else if(humidity<60){
            acl.powerOn();
            acl.humidification();
		}
                
		// AirConditioner Optim
		if(26<temperature){
			aco.powerOn();
			aco.switchMode(0);
			aco.switchPowers(1);
		}else if(25<temperature || temperature<26){
			aco.powerOn();
			aco.switchMode(0);
			aco.switchPowers(0);
		}else if(24<temperature || temperature<25){
			aco.powerOn();
			aco.switchMode(1);
			aco.switchPowers(0);
		}else if(temperature<24){
			aco.powerOn();
			aco.switchMode(1);
			aco.switchPowers(1);
		}

		
		System.out.println(w.getStatus());	
		System.out.println(acl.getStatus());
		System.out.println(aco.getStatus());
	}
}






