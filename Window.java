public class Window extends SwitchgearDevice {
	
	public Window(int dI){
		state = false;
		deviceId = dI;
		deviceName = "Window";
		System.out.println("Constructor: "+super.getStatus());
	}

	public String getStatus(){
		return super.getStatus();
	}
}
