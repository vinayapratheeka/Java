package Usecases;

import java.util.Scanner;

public class WeatherAnalyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String city = sc.next();
		float temp = sc.nextFloat();
		boolean isHot;
		final int threshold = 30;
		if(temp > threshold) {
			isHot = true;
		}
		else {
			isHot = false;
		}
		WeatherRecord record = new WeatherRecord(city, temp);
		record = null;
		System.out.println("City: "+city);
		System.out.println("Temperature: "+temp);
		if (isHot) {
            System.out.println("Condition: Hot Day");
        } else {
            System.out.println("Condition: Normal Day");
        }

        sc.close();

	}
}


class WeatherRecord {

    String city;
    float temperature;
    WeatherRecord(String city, float temperature) {
        this.city = city;
        this.temperature = temperature;
    }
}
