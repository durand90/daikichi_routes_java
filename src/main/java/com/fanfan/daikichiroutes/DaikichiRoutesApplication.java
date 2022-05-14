package com.fanfan.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	
	
	@RequestMapping("/daikichi")
	public String newRoute() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today")
	public String routeTwo() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/daikichi/tomorrow")
		public String routeThree() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		}
	
	@RequestMapping("/daikichi/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city;
		}
	
	@RequestMapping("/daikichi/lotto/{num}")
		public String oddEven(@PathVariable("num") String num) {
			if(Integer.parseInt(num) % 2 == 0) {
				return "You will take a grand journey in the near future, but be weary of temping offers.";
			}
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}


