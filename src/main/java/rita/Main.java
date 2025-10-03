package rita;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Main {
    public static void main(String[] args) {
        var context = SpringApplication.run(Main.class, args);
    }
}