package ram.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudConfigServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerEurekaApplication.class, args);
	}

}
