package com.dxbair.services.flightbooking.airport;

import com.dxbair.services.flightbooking.domain.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

//	private static final Logger logger = LoggerFactory.getLogger(AirportController.class);
	
	@GetMapping
	public @ResponseBody List<Airport> getAllAirports() {
		return airportService.getAllAirports();
	}

	@GetMapping("/{iata-code}")
	public @ResponseBody Airport getAirportById(@PathVariable("iata-code") String iataCode) {
		return airportService.getAirportById(iataCode);
	}
}
