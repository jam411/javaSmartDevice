public class Curtain extends SwitchgearDevice{
	
	public Curtain(int dI){
		state = false;
		deviceId = dI;
		deviceName = "Curtain";
		System.out.println("Constructor: "+super.getStatus());
	}

	public String getStatus(){
		return super.getStatus();
	}
}
