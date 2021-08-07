public class Operater {
	private SmartDevice[] sdevice;
	int num;

	public Operater() {
		num = 0;
		sdevice = new SmartDevice[10];
		System.out.println("Constructor: Operater");
	}
	
	public void add(SmartDevice sd){
		if(num < sdevice.length){
			sdevice[num] = sd;
			num ++;
		}
	}	

	// Display all status
	public void show(){
        for(int i = 0; i < num; i++) {
			System.out.println(sdevice[i].getStatus());
		}
	}
	
	// Control device.
	public void control(Door d, Light l, AirConditioner aco, AirCleaner acl) {
		// Door unlock()
		d.unlock();
		
		// Light Error = 11
		l.changeBrightness(11);
		// Light brightness = 6
		l.changeBrightness(6);

		// AirConditioner switchMode/switchPowers/switchDir.
		aco.switchMode(1);
		aco.switchPowers(1);
		aco.switchDir(1);

		// AirCleaner humidification
		for(int i = 0; i < 10; i++){
			// Try show remaining info.
			acl.humidification();
		}
		// dehumidification
		acl.dehumidification();

		System.out.println(d.getStatus());
		System.out.println(l.getStatus());
		System.out.println(aco.getStatus());
		System.out.println(acl.getStatus());
	}

	public void optimize(AirCleaner acl, AirConditioner aco, Window w, Light l, Curtain c){
	    Meter m = new Meter();
        RoomTempOptimizer rto = new RoomTempOptimizer();
        RoomLightOptimizer rlo = new RoomLightOptimizer();

		rto.getMeter(m);
		rlo.getMeter(m);
		
		rto.tempOptimize(acl, aco, w);
		rlo.lightOptimize(w, l, c);
	}
}
