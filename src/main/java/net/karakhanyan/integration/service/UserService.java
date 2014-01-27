package net.karakhanyan.integration.service;

import net.karakhanyan.integration.entity.User;

import java.util.Collection;

/**
 * Created by Ashot Karakhanyan on 27-01-2014
 */
public interface UserService {
    public User getById(int id);
    public Collection<User> getAll();
}
