/**
 * 
 */
package com.example.tollsystems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tanmoy Dasgupta
 */

@RestController
@RequestMapping("/toll")
public class TollSystemController {
	
	@GetMapping(value="/fetchdata")
	public String dataReturn() {
		return "data return :: ";
	}
	
}
