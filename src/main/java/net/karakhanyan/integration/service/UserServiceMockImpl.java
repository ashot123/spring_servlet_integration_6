package net.karakhanyan.integration.service;

import net.karakhanyan.integration.entity.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashot Karakhanyan on 27-01-2014
 */
public class UserServiceMockImpl implements UserService {

    private static final Map<Integer, User> users = new HashMap<Integer, User>();

    static {
        users.put(1, new User(1, "John Smith"));
        users.put(2, new User(2, "Andreas Brian"));
        users.put(3, new User(3, "Hem Adriano"));
    }

   @Override
    public User getById(int id) {
        return users.get(id);
    }

    @Override
    public Collection<User> getAll() {
        return users.values();
    }
}
