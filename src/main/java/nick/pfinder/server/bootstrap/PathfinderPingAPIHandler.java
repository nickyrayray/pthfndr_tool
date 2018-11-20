package nick.pfinder.server.bootstrap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nickyrayray on 11/18/18.
 */
@RestController
public class PathfinderPingAPIHandler {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

}
