public class RoomLightOptimizer extends Optimizer{
	private int brightness;

	public RoomLightOptimizer(){
		brightness = 0;
		System.out.println("Constructor: RoomLightOptimizer");
	}

	public void getMeter(Meter m){
		brightness = m.getBrightness();
		System.out.println("RoomLight getMeter: brightness:"+brightness);
	}

	public void lightOptimize(Window w, Light l, Curtain c){
		// Window Optim
		w.close();
		
		// Light Optim
		if(brightness>=8){
            l.powerOn();
            l.changeBrightness(8);
        }else if(brightness<8){
            l.powerOff();
        }
                
		// Curtain Optim
		if(brightness>=8){
			c.close();
		}else if(brightness<8){
			c.open();
		}
		
		System.out.println(w.getStatus());
		System.out.println(l.getStatus());
		System.out.println(c.getStatus());
	}
}
