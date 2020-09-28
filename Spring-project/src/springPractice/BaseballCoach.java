package springPractice;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice for 3 pointers";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
