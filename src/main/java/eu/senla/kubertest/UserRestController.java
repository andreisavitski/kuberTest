package eu.senla.kubertest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @PostMapping("/add")
    public Map<String, String> addUser(@RequestBody Map<String, String> request) {
        String login = request.get("username");
        UserDto dto = new UserDto(login);
        userService.addUser(dto);
        Map<String, String> response = new HashMap<>();
        response.put("message", "login successful for user: " + login);
        return response;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
