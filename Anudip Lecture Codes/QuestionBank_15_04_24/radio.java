package QuestionBank_15_04_24;

public class radio implements RemoteControl {
	boolean isOn=false;
	int volume=30;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isOn=true;
		System.out.println("Radio is turned on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isOn=false;
		System.out.println("Radio is turned off");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(isOn==true && volume<100) {
			volume++;
			System.out.println("Volume increased to " + volume);
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(isOn==true && volume>0) {
			volume--;
			System.out.println("Volume decreased to " + volume);
		}
	}
	
	public static void main(String[]args) {
		radio obj= new radio();
		obj.turnOff();
		obj.turnOn();
		obj.volumeUp();
		obj.volumeDown();
	}

}
