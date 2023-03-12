package restapicourse.restapi1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {
	@GetMapping("/home")
	int demo() {
		return 5;
	}

}
