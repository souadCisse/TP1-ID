package dao;

import dao.IUSB;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("clavier")
@Primary
public class USBClavier implements IUSB {
    @Override
    public int read() {
        System.out.println("this is a keyboard!");
        return 0;
    }
}
