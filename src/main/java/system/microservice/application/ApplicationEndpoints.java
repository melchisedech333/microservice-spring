
package system.microservice.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationEndpoints {

    @GetMapping("/ihs")
    public String IHS() {
        return "Iesus Hominum Salvator s2";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello xD";
    }
}


