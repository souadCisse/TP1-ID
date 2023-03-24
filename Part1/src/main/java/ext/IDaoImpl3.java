package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("capteur")
public class IDaoImpl3 implements IDao {
    @Override
    public double getData() {
        System.out.println("version Capteur");
        double d=50 ;
        return d;
    }
}
