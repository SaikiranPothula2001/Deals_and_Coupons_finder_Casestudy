package catalogue_mcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class CouponsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponsCatalogApplication.class, args);
	}

}
