package testapp.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestAppApplication {

	public static void main(String[] args) {

		int x = 1;

		if(x == 0){
			System.out.println("Result is 0");
		} else if(x == 1){
			System.out.println("Result is 1");
		} else if(x == 2){
			System.out.println("Result is 2");
		}
	}

}
