package dao;

import dao.IVGA;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ecran")

public class VGAEcran implements IVGA {
    @Override
    public void print(String message) {
        System.out.println("ecran bien connecte");
    }
}
