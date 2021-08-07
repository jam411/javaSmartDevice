public class Main {
	public static void main(String[] args) {
		// Generate Objects
		System.out.println("###1.Generate Objects:###");
		Operater o = new Operater();
		// Generate Smart Device Objects
		Door d0 = new Door(0);
                AirCleaner acl0 = new AirCleaner(0);
                AirConditioner aco0 = new AirConditioner(0);
                Light l0 = new Light(0);
                Window w0 = new Window(0);
                Curtain c0 = new Curtain(0); 
		// Add SmartDevice list
		o.add(d0);
		o.add(acl0);
		o.add(aco0);
		o.add(l0);
		o.add(w0);
		o.add(c0);
			
		// Display all device status.
		System.out.println("###2.Display Device Status###");
		o.show();
		
		// Control. -> this test contorl Door, Light, AirConditioner, AirCleaner.
		// Input:d,l
		System.out.println("###3.Control Device Door, Light, AirConditioner and AirCleaner###");
		o.control(d0,l0,aco0,acl0);

		// Optimize.
		// Input:acl,aco,w,l,c
		System.out.println("###4.Optimization, Gen Optim Objects -> do Optim -> show status###");
		o.optimize(acl0,aco0,w0,l0,c0);
	}
}
