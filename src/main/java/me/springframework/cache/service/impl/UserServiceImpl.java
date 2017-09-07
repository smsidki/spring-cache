package me.springframework.cache.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import me.springframework.cache.model.Identity;
import me.springframework.cache.model.User;
import me.springframework.cache.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

	@Cacheable(value = "userCache", key = "#id.idCard")
	public User getUser(Identity id) {
		LOG.info("Populating user data based on id card : " + id.getIdCard());
		User user = new User();
		user.setUserName("yapzor");
		user.setPassword("yapzorize!234%");
		user.setEmail("yap@zor.gg");
		user.setRole("CUSTOMER");
		Identity ident = new Identity();
		ident.setFirstName("Daniel");
		ident.setLastName("Ishutin");
		ident.setOccupation("Midlaner");
		ident.setIdCard(1101061407930001L);
		user.setIdentity(ident);
		return user;
	}

}
