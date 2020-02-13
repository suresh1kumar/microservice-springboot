package com.microservice.app;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
