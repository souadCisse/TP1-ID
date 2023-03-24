package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("VgaAdapter")
@Primary
public class HdmiVgaAdapter implements IVGA {
    private IHDMI hdmi;

    public HdmiVgaAdapter(IHDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        byte[] b=message.getBytes();
        hdmi.print(b);

    }
}
