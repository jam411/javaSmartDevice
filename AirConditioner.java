public class AirConditioner extends PowerDevice {
	String mode;
	String powers;
	String dir;
	
	public AirConditioner(int dI){
		power = false;
		deviceId = dI;
		deviceName = "AirConditioner";
		mode = "Cooler";
		powers = "Low";
		dir = "Swing";
		System.out.println("Constructor: "+super.getStatus()+" Mode:"+mode+" Power:"+powers+" Direction:"+dir);
	}

    public String getStatus(){
        return super.getStatus()+" Mode:"+mode+" Power:"+powers+" Direction:"+dir;
    }

	public void switchMode(int option) {
		if(option==0){
			mode = "Cooler";
		}else if(option==1){
			mode = "Heater";
		}else{
			System.out.println("Error:AirConditioner Mode, Please Input:0~1.");
		}
	}

	public void switchPowers(int option) {
		if(option==0){
			powers = "Low";
		}else if(option==1){
			powers = "Middle";
		}else if(option==2){
			powers = "High";
		}else{
			System.out.println("Error:AirConditioner Powers, Please Input:0~2.");
		}
	}

	public void switchDir(int option) {
		if(option==0){
			dir = "Swing";
		}else if(option==1){
			dir = "Upward";
		}else if(option==2){
			dir = "Middle";
		}else if(option==3){
			dir = "Downward";
		}else{
			System.out.println("Error:AirConditioner Dir, Please Input:0~3.");
		}
	}
}
