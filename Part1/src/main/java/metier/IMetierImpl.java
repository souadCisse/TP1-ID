package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    public IMetierImpl() {
    }
    @Autowired
    @Qualifier("capteur")
    private IDao dao ;
    @Override
    public double calcul() {
        double d=dao.getData();
        return d*10;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
