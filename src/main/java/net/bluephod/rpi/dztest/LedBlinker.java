package net.bluephod.rpi.dztest;

import com.diozero.devices.LED;

public class LedBlinker {
	public static void main(String[] args) throws Exception {
		System.out.println("LED Blinker demo");

		try(LED led = new LED(18)) {
			System.out.println("Setting pin 12 to HIGH - press return to go to low.");
			led.on();
			System.in.read();

			System.out.println("Setting pin 12 to LOW and exiting");
			led.off();
		}


		System.exit(0);
	}
}
