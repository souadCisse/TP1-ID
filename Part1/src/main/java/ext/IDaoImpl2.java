package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("ws")
public class IDaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version Web Service");
        double d=40 ;
        return d;
    }
}
