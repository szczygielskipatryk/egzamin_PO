public class Laptop  extends Komputer implements Comparable<Komputer>{
    public Laptop(String nazwa, int rok, int miesiac,int dzien, boolean czyApple)
    {
        super(nazwa,rok,miesiac,dzien);
        this.czyApple=czyApple;
    }
    public int compareTo(Laptop o)
    {
        int d=compareTo((Komputer)o);
        if(d==0)
        {
            d=Boolean.compare(this.czyApple,o.czyApple);
        }
        return d;
    }
    private boolean czyApple;
}
