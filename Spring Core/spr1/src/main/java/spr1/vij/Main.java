package spr1.vij;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static ApplicationContext context;
  public static void main(String []args) {
	  context = new ClassPathXmlApplicationContext ("beans.xml");
	  HelloWorld helloWorld =(HelloWorld) context.getBean("HelloWorld");
	  helloWorld.sayHello();
  }
}
