package com.IOC.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

//	  Mobiles onePlus=new OnePlus();
//	  onePlus.getModelAndColor();
                                  // Generally we do like this for objects create and access properties
//	  Mobiles iphone=new Iphone();
//	  iphone.getModelAndColor();
                                //Instated of create obj manually we should create bean in spring container with configuration

		                        // Now create container for store bean available over application (Application context)

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
	    Mobiles onePlus=context.getBean("getOnePlusObject",Mobiles.class);
		Mobiles iphone=context.getBean("getIphoneObject",Mobiles.class);
		onePlus.getModelAndColor();
		iphone.getModelAndColor();

		//This is IOC


	}

}
