package me.springframework.cache.service;

import me.springframework.cache.model.Identity;
import me.springframework.cache.model.User;

public interface UserService {

	User getUser(Identity id);

}
