import java.util.Random;

public class Meter{

	public Meter(){
		System.out.println("Constructor: Meter");
	}

	public int getTemperature(){
		Random random = new Random();
		return random.nextInt(35);
	}

	public int getHumidity(){
		Random random = new Random();
		return random.nextInt(100);
	}

	public int getBrightness(){
		Random random = new Random();
		return random.nextInt(10);
	}
}	
