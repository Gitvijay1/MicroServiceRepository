package in.nit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@Value("${server.port}")
	private int port;
	@GetMapping("/show")
	public String show()
	{
		return "from product-->"+port;
	}

}
