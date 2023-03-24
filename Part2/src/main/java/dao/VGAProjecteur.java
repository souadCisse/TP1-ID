package dao;

import dao.IVGA;
import org.springframework.stereotype.Component;

@Component("projecteur")
public class VGAProjecteur implements IVGA {
    @Override
    public void print(String message) {
        System.out.println("video projecteur connecte");
    }
}
