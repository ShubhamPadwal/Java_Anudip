/*Remote Control Interface: Define an interface named RemoteControl with methods turnOn(), 
 *turnOff(), volumeUp(), and volumeDown(). Implement this interface in classes for different electronic devices
 *such as Television, Radio, and DVDPlayer. Test these implementations by creating objects of each device and 
 *using the remote control methods to operate them.
 */
package QuestionBank_15_04_24;

public interface RemoteControl {
	public void turnOn();
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
}
