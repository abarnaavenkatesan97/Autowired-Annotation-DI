package manPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("manspring.xml");
		Man man = context.getBean("man",Man.class);
		man.printer();

	}

}
