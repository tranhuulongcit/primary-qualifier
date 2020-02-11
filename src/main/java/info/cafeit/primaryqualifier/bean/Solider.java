package info.cafeit.primaryqualifier.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Solider {
    private final Gun gun;

    public Solider(@Qualifier("thompson") Gun gun) {
        this.gun = gun;
    }

    public void action() {
        if (gun != null) {
            gun.fire();
        } else {
            System.out.println("Chưa trang bị vũ khí.");
        }
    }
}
