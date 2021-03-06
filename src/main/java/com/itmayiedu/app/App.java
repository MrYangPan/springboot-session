
package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.itmayiedu.controller.IndexController;


@ComponentScan(basePackages="com.itmayiedu")
@EnableAutoConfiguration
public class App {

	 public static void main(String[] args) {
		 SpringApplication.run(App.class, args);
	}
	
}
