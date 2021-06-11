package FallBackControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User service is taking longer than expected. Please try again!";
    }

    @GetMapping("/ownerServiceFallBack")
    public String ownerServiceFallBack(){
        return "Owner service is taking longer than expected. Please try again!";
    }


    @GetMapping("/restaurantServiceFallBack")
    public String restaurantServiceFallBack(){
        return "Restaurant service is taking longer than expected. Please try again!";
    }



}
