import java.util.ArrayList;
import java.util.Comparator;

public class KomputerTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Komputer> grupa = new ArrayList<>();
        grupa.add(new Komputer("Kubuś", 2010, 11, 21));
        grupa.add(new Komputer("Kubuś", 2011, 01, 13));
        grupa.add(new Komputer("Jonko", 2002, 03, 1));
        grupa.add(new Komputer("Kojko", 2002, 03, 1));
        grupa.add(new Komputer("Liter", 1998, 06, 12));
        System.out.print(grupa);
        grupa.sort(new Comparator<Komputer>() {
            @Override
            public int compare(Komputer komputer, Komputer t1) {
                return komputer.compareTo(t1);
            }
        });
        System.out.print("\n"+grupa);


    }
}
