package ram.learn.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
//@RequestMapping("/data")
@RefreshScope 
public class ClientForProvider {

	@Autowired
	@Lazy
	private RestTemplate template;
	
	@Value("${provider.url}")
    private String uri;
	
	@GetMapping("/getAllTeam")
	public List<String> getTeams(){
		List<String> teams=template.getForObject(uri,List.class);
	 return teams;
	}
	 
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
