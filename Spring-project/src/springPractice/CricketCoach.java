package springPractice;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Set Email Address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Set team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Inside no args constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do practice of fast bowling for 15 mins";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
