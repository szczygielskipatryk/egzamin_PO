public class ArrayUtil{
    public static <T extends Comparable<? super T>>boolean isSorted(T[]tablica)
    {
        T pierwszy=tablica[0];
        {
            for(int i=0;i<tablica.length;i++)
            {
                if(pierwszy.compareTo(tablica[i])>0)
                {
                    return false;
                }
                pierwszy=tablica[i];
            }
        }
        return true;
    }
}