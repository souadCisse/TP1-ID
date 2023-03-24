package dao;

import org.springframework.stereotype.Component;
@Component("db")
public class IDaoImpl implements IDao {

    public IDaoImpl() {

    }
    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double d=30 ;
        return d;
    }
}
