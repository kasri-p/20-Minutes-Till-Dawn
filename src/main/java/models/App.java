package models;

import models.utils.FileStorage;

import java.util.Map;

public class App {
    private static Map<String, User> users;

    public static void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public static User getUser(String username) {
        return users.get(username);
    }

    public static void load() {
        users = FileStorage.loadUsers();
    }

    public static void save() {
        FileStorage.saveUsers(users);
    }
}
