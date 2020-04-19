package gdc.service.GDC_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GdcServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdcServiceApplication.class, args);
	}

}
