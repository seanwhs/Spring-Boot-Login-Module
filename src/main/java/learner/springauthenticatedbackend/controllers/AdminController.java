// AdminController.java
package learner.springauthenticatedbackend.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
class AdminController {

    @GetMapping("/")
    String helloAdminController(){
        return "<h1>Admin Level Access</h1>";
    }
    
}
