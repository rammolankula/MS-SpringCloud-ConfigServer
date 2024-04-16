package ram.learn.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Data")
public class ProviderRestController {

	
   @GetMapping("/getAll")
	public List<String> getplans(){
		return Stream.of("RCB","Mumbai","GT").collect(Collectors.toList());
	}
	
}
