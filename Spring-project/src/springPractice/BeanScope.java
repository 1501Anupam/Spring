package springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("The result of reference of Singleton class is: "+ result);
		System.out.println("Memory location of theCoach : "+ theCoach);
		System.out.println("Memory location of alphaCoach : "+ alphaCoach);
		context.close();
	}

}
