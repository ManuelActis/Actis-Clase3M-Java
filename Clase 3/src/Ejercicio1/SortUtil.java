

public class SortUtil {

    public static <T extends Precedable<T>> void ordenar(Precedable<T>  arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
//				if( arr[j]>arr[j+1] )
                if( arr[j].precedeA((T) arr[j+1])>0 )
                {
                    T aux= (T) arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }


    }




}
