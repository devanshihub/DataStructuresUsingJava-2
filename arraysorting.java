package data_structures_java_2;
import java.util.Scanner;

class arr
{
   static void bubble_sort(int a[])
   {
    int i,j;
    for( i=0;i<a.length-1;i++)
    {
        for( j=0;j<a.length-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
   }
}
class arraysorting
{
    public static void main(String k[])
    {
        int a[]=new int[5];
         arr.bubble_sort(a);
         for(int b:a)
         System.out.print(b+" ");
    }
}
