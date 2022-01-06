package Test.Constructor2;

public class RunUSBMemory {

	public static void main(String[] args) {

		USBMemory usb1 = new USBMemory(64, "BLACK&SILVER");
		USBMemory usb2 = new USBMemory(256, "RED");
		
		usb1.writeUSBMemory();
		usb2.writeUSBMemory();
		
		System.out.println("-------------------------");
		
		usb2.readUSBMemory();
		
		
		
	}

}
