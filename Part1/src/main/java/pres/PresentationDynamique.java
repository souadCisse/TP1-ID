package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class CDao= Class.forName(daoClassName);
        IDao dao= (IDao) CDao.getConstructor().newInstance();

        String metierClassName=scanner.nextLine();
        Class CMetier= Class.forName(metierClassName);
        IMetier metier= (IMetier) CMetier.getConstructor().newInstance();

        Method setDao=CMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);

        System.out.println( metier.calcul());




    }
}
