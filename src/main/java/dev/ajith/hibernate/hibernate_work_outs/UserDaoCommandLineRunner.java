package dev.ajith.hibernate.hibernate_work_outs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.ajith.hibernate.hibernate_work_outs.entity.User;
import dev.ajith.hibernate.hibernate_work_outs.service.UserDaoService;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {
	@Autowired
	private UserDaoService userDaoService;

	private static final Logger log = LoggerFactory.getLogger(UserDaoCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user = new User("John", "Admin");
		Long id = userDaoService.insert(user);
		log.info("User inserted with id  :-" + id + " "+user);
	}

}
