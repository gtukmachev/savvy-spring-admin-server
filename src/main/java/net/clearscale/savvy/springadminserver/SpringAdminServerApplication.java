package net.clearscale.savvy.springadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminServerApplication {

	public static void main(String[] args) {
		setupAwsParameterStoreIntegration();

		SpringApplication.run(SpringAdminServerApplication.class, args);
	}

	private static void setupAwsParameterStoreIntegration() {
		String env = System.getProperty("AWS_ENV", "");
		if (env.length() > 0) {
			env = "/" +env;
		}
		System.setProperty("psSpringProfiles","prod,production"); // activated for 'production' spring profile only
		System.setProperty("psRoots", env + "/sba," + env + "/common"); // 2 root folders will be used for reading properties
	}


}
