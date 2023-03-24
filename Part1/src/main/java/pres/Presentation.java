package pres;

import dao.IDaoImpl;
import metier.IMetier;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        IDaoImpl dao=new IDaoImpl();
        IMetierImpl metier=new IMetierImpl();
        metier.setDao(dao);

        System.out.println( metier.calcul());
    }
}
