package QuestionBank_15_04_24;

public class television implements RemoteControl {
	
	boolean isOn=false;
	int volume=10;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isOn=true;
		System.out.println("TV is turned on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isOn=false;
		System.out.println("TV is turned off");
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
		television obj= new television();
		obj.turnOff();
		obj.turnOn();
		obj.volumeUp();
		obj.volumeDown();
	}

}
