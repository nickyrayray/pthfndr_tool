package nick.pfinder.server.bootstrap;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by nickyrayray on 9/3/17.
 */

@Component
public class PathfinderResourceConfig extends ResourceConfig {

    public PathfinderResourceConfig(){
        System.out.println("Bootstrapping the resources...");
    }

}
