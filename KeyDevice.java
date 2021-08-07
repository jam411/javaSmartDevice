public class KeyDevice extends SmartDevice {
	Boolean key;

	public String getStatus(){
		return "Id:"+deviceId+" Name:"+deviceName;
	}

	public void lock(){
		key = true;
	}
	
	public void unlock(){
		key = false;
	}
}

