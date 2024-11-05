package io.ravneet.springbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBeanApplication.class, args);
//		BMW m4 = new BMW("M4","2024", new DieselEngine(550));
//		System.out.println(m4);

//		  Employee e1 = new Employee("a", "b","Google");


//		xml configuration application context
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");

		Employee bean = context.getBean(Employee.class);

		System.out.println(bean);

	}

}
