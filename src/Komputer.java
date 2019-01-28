import java.time.LocalDate;
import java.util.Objects;

public class Komputer implements Comparable<Komputer> ,Cloneable{

    public Komputer(String nazwa, int rok, int miesiac, int dzien) {
        this.nazwa = nazwa;
        dataProdukcji=LocalDate.of(rok,miesiac,dzien);
    }

    public String getNazwa() {
        return nazwa;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komputer komputer = (Komputer) o;
        return nazwa.equals(komputer.nazwa) &&
                dataProdukcji.equals(komputer.dataProdukcji);
    }
    @Override
    public int compareTo(Komputer o) {

        int d=this.nazwa.compareTo(o.nazwa);
        if(d==0)
        {
            d=this.dataProdukcji.compareTo(o.dataProdukcji);
        }
        return d;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString()
    {
        return "Nazwa: "+this.nazwa+" Data produkcji: "+this.dataProdukcji;
    }

    private String nazwa;
    private LocalDate dataProdukcji;
}
