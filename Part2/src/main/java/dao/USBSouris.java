package dao;

import dao.IUSB;
import org.springframework.stereotype.Component;

@Component("souris")
public class USBSouris implements IUSB {
    @Override
    public int read() {
        return 0;
    }
}
