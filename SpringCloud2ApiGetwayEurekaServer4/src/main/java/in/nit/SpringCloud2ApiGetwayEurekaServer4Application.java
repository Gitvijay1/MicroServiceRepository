package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud2ApiGetwayEurekaServer4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud2ApiGetwayEurekaServer4Application.class, args);
	}

}
