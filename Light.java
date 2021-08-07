public class Light extends PowerDevice {
	int brightness;

	public Light(int dI){
		power = false;
		deviceId = dI;
		deviceName = "Light";
		brightness = 10;
		System.out.println("Constructor: "+super.getStatus()+" Brightness:"+brightness);
	}

    public String getStatus() {
        return super.getStatus()+" Brightness:"+brightness;
    }

	public void changeBrightness(int option) {
		if(option<1 || option>10){
			System.out.println("Error: Light Brightness, Please Input:1~10.");
		}else{
			brightness = option;
		}
	}
}
