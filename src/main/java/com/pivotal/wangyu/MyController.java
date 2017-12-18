package com.pivotal.wangyu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@RequestMapping("/init")
	public String testHello () {
		reservationRepository.save(new Reservation("wang","yu"));
		reservationRepository.save(new Reservation("paul","yang"));
		reservationRepository.save(new Reservation("jun","gang"));
		return "success init!";
	}
	
	@RequestMapping("/all") 
	public List<Reservation> getAll(){
		return reservationRepository.findAll();
	}

}

