package br.com.screenmatchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${user.home}/screenmatch/screenmatch.properties")
public class ScreenMatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}
}