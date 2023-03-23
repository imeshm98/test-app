package testapp.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestAppApplication {

	public static void main(String[] args) {

		int number = 10;

		if (number < 5) {
		    System.out.println("Number is less than 5"); } 
		else if (number < 10) {
		    System.out.println("Number is between 5 and 9");
		}
	}

}
