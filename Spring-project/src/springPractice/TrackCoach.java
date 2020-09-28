package springPractice;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 5 km daily";
	}

	@Override
	public String getFortune() {
		return null;
	}

	public void doMyStartUpStuff() {
		System.out.println("Inside startup method: doMyStartUpStuff()");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Inside cleanup method: doMyCleanUpStuff()");
	}
	
}
