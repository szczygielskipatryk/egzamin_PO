import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Wejsciowka_I
{
    public static<E, T extends Iterable<E>>void print(T cos)
    {
        Iterator a=cos.iterator();
        while(a.hasNext())
        {
            System.out.print(a.next()+", ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Plik>a=new ArrayList();
        a.add(new Plik("Jak5",18,true));
        a.add(new Plik("Jak3",24,true));
        a.add(new Plik("Jak4",2124,true));
        a.add(new Plik("Jak5",20214,true));
        a.add(new Plik("Jak2",2,true));
        print(a);
        Plik[]tmp=new Plik[a.size()];
        a.toArray(tmp);
        System.out.println(ArrayUtil.isSorted(tmp));
        print(Arrays.asList(tmp));
        System.out.println();
        Arrays.sort(tmp);
        System.out.println(ArrayUtil.isSorted(tmp));
        print(Arrays.asList(tmp));


    }
}