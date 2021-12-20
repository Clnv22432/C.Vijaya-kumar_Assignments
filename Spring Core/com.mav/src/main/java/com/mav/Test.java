package com.mav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext applicationcontext=new ClassPathXmlApplicationContext("beans.xml");  
        ActBankC obj=(ActBankC)applicationcontext.getBean("obj");  
        obj.withdraw();     
        }
}
