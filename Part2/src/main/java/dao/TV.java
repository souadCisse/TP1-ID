package dao;

import dao.IHDMI;
import org.springframework.stereotype.Component;

@Component("tv")
public class TV implements IHDMI {
    @Override
    public void print(byte[] data) {
        String d=new String(data);
        System.out.println( d);
    }
}
