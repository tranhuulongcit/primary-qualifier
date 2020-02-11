package info.cafeit.primaryqualifier.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ShortGun implements Gun {
    @Override
    public void fire() {
        System.out.println("Shortgun is firing...");
    }
}
