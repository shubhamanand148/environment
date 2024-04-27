package profiler.environment.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import profiler.environment.entity.User;
import profiler.environment.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("allUsers")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @PostMapping("addUser")
    public void postMethodName(@RequestBody User user) {
        userRepo.save(user);
    }
    
    
}
