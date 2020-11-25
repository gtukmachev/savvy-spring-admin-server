package net.clearscale.savvy.springadminserver;

import static ch.qos.logback.core.util.OptionHelper.isEmpty;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminServerApplication {

	public static void main(String[] args) {
		String env = System.getProperty("AWS_ENV", "");

		setupAwsParameterStoreIntegration(env);
		updateApplicationName(env);

		SpringApplication.run(SpringAdminServerApplication.class, args);
	}

	private static void setupAwsParameterStoreIntegration(String env) {
		String envPath = env;
		if (env.length() > 0) { env = "/" +env; }
		System.setProperty("psSpringProfiles","prod,production"); // activated for 'production' spring profile only
		System.setProperty("psRoots", envPath + "/sba," + envPath + "/common"); // 2 root folders will be used for reading properties
	}

	private static void updateApplicationName(String suffix) {
		String property = "spring.application.name";
		String newValue = System.getProperty(property);
		if (isEmpty(newValue)) {
			newValue = "SBA";
		}
		if (!isEmpty(suffix)) {
			newValue += (" [" + suffix + "]");
		}
		System.setProperty(property, newValue);
	}


}
