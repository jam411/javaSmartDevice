public class PowerDevice extends SmartDevice {
	Boolean power;
	int option;

	public String getStatus(){
		if(power==false){
			return "Id:"+deviceId+" Name:"+deviceName+" Power:OFF";
		}else{
			return "Id:"+deviceId+" Name:"+deviceName+" Power:ON";
		}

	}

	public void powerOn() {
		power = true;
	}

	public void powerOff() {
		power = false;
	}
}

