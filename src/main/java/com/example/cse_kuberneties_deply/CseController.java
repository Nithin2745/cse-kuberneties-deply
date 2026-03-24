package com.example.cse_kuberneties_deply;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
    @GetMapping("/cse/home")
	public String rocks() {
		return "WELCOME TO CSE KUBERNETES";
    }
}
