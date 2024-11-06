package io.ravneet.springbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.namespace.QName;

//@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBeanApplication.class, args);
//		BMW m4 = new BMW("M4","2024", new DieselEngine(550));
//		System.out.println(m4);

//		  Employee e1 = new Employee("a", "b","Google");


//		xml configuration application context
//		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");


		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");


		context.registerShutdownHook();
		Employee bean = context.getBean(Employee.class);

		System.out.println(bean);

		DieselEngine de = context.getBean(DieselEngine.class);
		System.out.println(de);
		BMW m3 = context.getBean("m3",BMW.class);
		BMW m5 = context.getBean("m5",BMW.class);
		System.out.println(" M3 "+m3);
		System.out.println(" M5 "+ m5);



	}

}
