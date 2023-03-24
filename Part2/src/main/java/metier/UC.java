package metier;

import dao.IUSB;
import dao.IVGA;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UC {

    private IVGA vga ;

    private IUSB usb ;

    public UC(IVGA vga, IUSB usb) {
        this.vga = vga;
        this.usb = usb;
    }

    public int readData(){
        int d=usb.read();
        return d;
    }
    public void printData(String data){
        vga.print(data);
    }
}
