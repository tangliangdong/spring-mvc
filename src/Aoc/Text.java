package Aoc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*public class Text {
	public static void main(String[] args) {
		Performer performer = new Performer();
		performer.perform();
		
	}
	
}*/
public class Text {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                "Aoc/spring.xml");
		Performer performer = context.getBean(Performer.class);
		performer.perform();
	}
}
