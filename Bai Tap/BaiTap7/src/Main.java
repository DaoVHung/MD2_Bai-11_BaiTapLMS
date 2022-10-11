import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static Date getDate(String stringDate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
      return sdf.parse(stringDate);
    }

    public static void main(String[] args) throws ParseException {
        Queue<Persion> Class = new PriorityQueue<>();
        Persion persion1= new Persion("Hung",23,getDate("20/3/2033"),true);
        Persion persion2= new Persion("Mai", 24,getDate("14/5/2020"), false);
        Persion persion3= new Persion("Tiep",23,getDate("12/3/1122"),true);
        Class.add(persion1);
        Class.add(persion2);
        Class.add(persion3);
        for (Persion st:Class) {
            System.out.println(st);
        }

    }

}