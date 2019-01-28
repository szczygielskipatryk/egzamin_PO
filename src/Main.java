public class Main {

    public static void main(String[] args) {
        Plik mały=new Plik("Mały Plik",100,true);
        System.out.println(mały);

        System.out.println(Plik.getIle());

        Plik średni=new Plik(500,false);
        System.out.println(średni);

        PlikVideo małyPlikVideo=new PlikVideo("Mały Film",200,false,"1");
        małyPlikVideo.setDataUtworzenia(2009,02,28);
        System.out.println(małyPlikVideo);

        System.out.println(Plik.getIle());

        Plik[][]spis=new Plik[2][2];
        spis[0][0]=średni;
        spis[0][1]=mały;
        spis[1][0]=małyPlikVideo;
        spis[1][1]=średni;

        for(int i=0;i<spis.length;i++)
        {
            for(int j=0;j<spis[i].length;j++)

            {
                System.out.println(spis[i][j]);
            }
        }

        String[]spisNazw=new String[4];
        int f=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {

                spisNazw[f]=spis[i][j].getNazwa();
                f++;
            }
        }


        /*for(int i=0;i<spisNazw.length;i++)  test czy dobrze dodaje :v
        {
            System.out.print(spisNazw[i]+" ");
        }
        */
        System.out.println();
        for(Object[] a:spis)
        {
            for(Object b:a)
            {
                System.out.println(b);
            }
        }
        System.out.println(średni.equals(mały));
        System.out.println(średni.equals(małyPlikVideo));
        System.out.println(średni.compareTo(mały));
        System.out.println();
        int ileVideo=0;
        for(Plik[]a:spis)
        {
            for(Plik b:a)
            {
                if(b.getClass()==PlikVideo.class)
                {
                    ileVideo++;
                }
            }
        }
        System.out.println(mały.compareTo(małyPlikVideo));
        for(Plik[] a:spis)
        {
            for(Plik b:a)
            {
                System.out.print(b.getClass().getSimpleName()+", ");
            }
        }
    }
}
