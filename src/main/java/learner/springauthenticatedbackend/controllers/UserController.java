// UserController.java
package learner.springauthenticatedbackend.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
class UserController {
    
    @GetMapping("/")
    String helloUserController(){
        return "<h1>User Access Level</h1>";
    }
}
