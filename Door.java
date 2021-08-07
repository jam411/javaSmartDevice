public class Door extends KeyDevice{
	
	public Door(int dI){
		deviceId = dI;
		deviceName = "Door";
		key = true;
		System.out.println("Constructor: "+super.getStatus()+" KeyStatus:Lock");
	}

	public String getStatus() {
		if(key == false){
			return super.getStatus()+" KeyStatus:Unlock";
		}else{
			return super.getStatus()+" KeyStatus:Lock";
		}
	}	
}

