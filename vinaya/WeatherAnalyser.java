package vinaya;

class WeatherRecord {
	String city;
	float temperature;
	public WeatherRecord(){
		
	}
}
public class WeatherAnalyser{

public static void main(String[] args){
	String city=args[0];
	float temp=Float.parseFloat(args[1]);   
		 
	final int threshold=30;
	boolean isHot;
		 
	if(temp>threshold){
			isHot=true;
	}
	else{
		isHot=false;
	}
	System.out.println("City: "+city);
	System.out.println("Temperature: " +temp + "c" );
		 
	if(isHot){
		System.out.println("Condition: Hot Day");
	}
	else{
		System.out.print("Condition: Normal Day");
	}
	WeatherRecord record=new WeatherRecord();
	record.city=city;
	record.temperature=temp;
	record=null;
	}
}

