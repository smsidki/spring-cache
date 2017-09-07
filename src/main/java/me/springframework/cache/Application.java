package me.springframework.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.springframework.cache.model.Identity;
import me.springframework.cache.service.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private UserService userService;

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Identity id1 = new Identity();
		Identity id2 = new Identity();
		id1.setIdCard(1101061407930001L);
		id2.setIdCard(2121261504950011L);
		callService(id1);
		callService(id2);
		callService(id1);
	}
	
	private void callService(Identity id) {
		LOG.info("Calling user service started");
		userService.getUser(id);
		LOG.info("Finished Calling user service");
	}

}
