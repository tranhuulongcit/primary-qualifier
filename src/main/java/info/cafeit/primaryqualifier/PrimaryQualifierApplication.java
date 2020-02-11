package info.cafeit.primaryqualifier;

import info.cafeit.primaryqualifier.bean.Solider;
import info.cafeit.primaryqualifier.bean.Thompson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaryQualifierApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PrimaryQualifierApplication.class, args);
    }

    @Autowired
    private Solider solider;

    @Override
    public void run(String... args) throws Exception {
        solider.action();
    }
}
