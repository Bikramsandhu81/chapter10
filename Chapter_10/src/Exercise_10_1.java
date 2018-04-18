import java.math.BigInteger;

public class Exercise_10_1{
	int hours;
	long minutes;
	long second;
	
	public Exercise_10_1(){
		this.second = second;
		this.minutes = minutes;
		this.hours = hours;
		
	}
	
	public Exercise_10_1(long elapsed){
		long totalSeconds = System.currentTimeMillis() / 1000;
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minutes = totalMinutes % 60;
		long totalHours = totalMinutes /24;
		this.hours = (int)totalHours % 24;
		
		
	}
	
	public  Exercise_10_1(int hours, long minutes, long seconds){
		hours = this.hours;
		minutes = this.minutes;
		second= this.second;
	}
	
	public long getSeconds(long totalSeconds){
		this.second = totalSeconds % 60;
		return second;
	}
	
	public long getMinutes(long totalMinutes){
		this.minutes = totalMinutes % 60;
		return minutes;
	}
	
	public int getHours(int totalhours){
		this.hours = totalhours / 24;
		return hours;
	}
	
	public void setTime(long elapseTime){
		long totalSeconds = elapseTime / 1000;
		this.second = getSeconds(totalSeconds);
		
		long totalminutes = totalSeconds / 60;
		this.minutes = getMinutes(totalminutes);
		
		int totalhours = (int)totalminutes / 24;
		this.hours = getHours(totalhours);
	}

}
