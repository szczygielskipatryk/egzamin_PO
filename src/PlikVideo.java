import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class PlikVideo extends Plik{

    public PlikVideo(String nazwa,Integer rozmiar, boolean czydozap,String rozsz)
    {
        super (nazwa,rozmiar,czydozap);
        this.rozszerzenie=rozsz;
        this.dataUtworzenia= LocalDate.now();

    }
    public void setDataUtworzenia(int r, int m, int d)
    {
        this.dataUtworzenia=LocalDate.of(r,m,d);
    }
    public LocalDate getDataUtworzenia()
    {
        return this.dataUtworzenia;
    }
    @Override
    public String toString()
    {

        return super.toString()+", ["+this.dataUtworzenia.format(DateTimeFormatter.ISO_DATE)+"], ["+this.dataUtworzenia.getDayOfYear()+"], ["+this.dataUtworzenia.getDayOfWeek()+"]";
    }
    @Override
    public boolean equals(Object o)
    {
        return super.equals(o)&&this.dataUtworzenia.equals(((PlikVideo)o).dataUtworzenia)&&this.rozszerzenie.equals(((PlikVideo)o).rozszerzenie);
    }
    @Override
    public PlikVideo clone()

    {

        return new PlikVideo(getNazwa(),getRozmiar(),isCzyDoZapisu(),this.rozszerzenie);
    }
    public int compareTo(PlikVideo plik)
    {
        int d=super.compareTo(plik);
        if(d==0)
        {
            d=this.dataUtworzenia.compareTo(plik.dataUtworzenia);
            if(d==0)
            {
                d=this.rozszerzenie.compareTo(plik.rozszerzenie);
            }
        }
        return d;
    }
private LocalDate dataUtworzenia;
private String rozszerzenie;
}
