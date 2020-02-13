package com.microservice.app;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value={"/ticket"})
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	
	
	@GetMapping(value="/getTicket", headers="Accept=application/json")
    public List<Ticket> getAllUser() {
		System.out.println("\n\n\n***************"+ticketBookingService.getTicket()+"***************");
        List<Ticket> tasks=ticketBookingService.getTicket();
        return tasks;

    }
	
	
	
}
