import java.util.Objects;

public class Plik implements Cloneable,Comparable<Plik>{
    public Plik(String nazwa, Integer rozmiar, boolean czydozap)
    {
        this.nazwa=nazwa;
        this.czyDoZapisu=czydozap;
        this.rozmiar=rozmiar;
        ile++;
    }
    public Plik(Integer rozmiar, boolean czydozap)
    {
        this.nazwa="Jakis Plik";
        this.rozmiar=rozmiar;
        this.czyDoZapisu=czydozap;
        ile++;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(Integer rozmiar) {
        this.rozmiar = rozmiar;
    }

    public boolean isCzyDoZapisu() {
        return czyDoZapisu;
    }

    public void setCzyDoZapisu(boolean czyDoZapisu) {
        this.czyDoZapisu = czyDoZapisu;
    }

    public static int getIle() {
        return ile;
    }

    public static void setIle(int ile) {
        Plik.ile = ile;
    }
    @Override
    public String toString()
    {
        if(this.nazwa!="Jakis Plik"){return this.getClass().getSimpleName()+" ["+this.nazwa+"], ["+this.rozmiar+"], ["+this.czyDoZapisu+"]";}
        return this.getClass().getSimpleName()+" ["+this.rozmiar+"], ["+this.czyDoZapisu+"]";
    }

    @Override
    public Plik clone() throws CloneNotSupportedException {
        return new Plik(this.nazwa,this.rozmiar,this.czyDoZapisu);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (this.getClass()==o.getClass()) {
            Plik plik = (Plik) o;
            return czyDoZapisu == plik.czyDoZapisu &&
                    nazwa.equals(((Plik) o).nazwa) &&
                    rozmiar.equals(((Plik) o).rozmiar);
        }
        return false;
    }

    public int compareTo(Plik plik)
    {
        int d=this.rozmiar.compareTo(plik.rozmiar);
        if(d==0)
        {
            d=this.nazwa.compareTo(plik.nazwa);
        }
        return d;
    }

    private String nazwa;
    private Integer rozmiar;
    private boolean czyDoZapisu;
    private static int ile=0;

}
