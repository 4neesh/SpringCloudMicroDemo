package com.aneesh.microservice.secureService;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer //generates token to application
public class SecureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureServiceApplication.class, args);
	}
	

	@RequestMapping("/tolldata")
	public ArrayList<TollUsage> getTollData(){
		
		ArrayList<TollUsage> tollData = new ArrayList<>();
		
		TollUsage a1 = new TollUsage("301", "Station1", "KLJLJ", "2020-01-01T04:30:22");
		TollUsage a2 = new TollUsage("302", "Station1", "KLJ2J", "2020-01-01T04:31:22");
		TollUsage a3 = new TollUsage("303", "Station1", "K22LJ", "2020-01-01T04:33:22");

		tollData.add(a1);
		tollData.add(a2);
		tollData.add(a3);
		
		return tollData;
	}

	
	public class TollUsage{
		
		public String id;
		public String stationId;
		public String licensePlate;
		public String timeStamp;
		
		public TollUsage() {
			
		}
		
	
		public TollUsage(String id, String stationId, String licensePlate, String timeStamp) {
			this.id = id;
			this.stationId = stationId;
			this.licensePlate = licensePlate;
			this.timeStamp = timeStamp;
		}
		
		
	}

}
