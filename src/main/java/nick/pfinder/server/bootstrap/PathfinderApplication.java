package nick.pfinder.server.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by nickyrayray on 9/3/17.
 */

@SpringBootApplication
@ComponentScan({"nick.pfinder.server"})
public class PathfinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PathfinderApplication.class, args);
    }

}
