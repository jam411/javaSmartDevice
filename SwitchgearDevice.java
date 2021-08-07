public class SwitchgearDevice extends SmartDevice {
	Boolean state;
	
	public String getStatus(){
		if(state==false){
			return "Id:"+deviceId+" Name:"+deviceName+" State:Close";
		}else{
			return "Id:"+deviceId+" Name:"+deviceName+" State:Open";
		}
	}

	public void open(){
		state = true;
	}

	public void close(){
		state = false;
	}
}
