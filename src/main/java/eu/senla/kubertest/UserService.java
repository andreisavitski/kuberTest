package eu.senla.kubertest;

import java.util.List;

public interface UserService {

    void addUser(UserDto dto);

    List<User> getAllUsers();
}
