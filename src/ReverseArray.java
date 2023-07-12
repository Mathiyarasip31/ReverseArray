import java.util.Scanner;
class Reverse
{
    void rev_value(int array[],int n){
        int i=0;
        int j=n-1;
        int temp=0;
        while(i<j)
        {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        System.out.println("Array after reversing: ");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }


    }
}

public class ReverseArray{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        Reverse reverse=new Reverse();
        reverse.rev_value(array,n);

    }
}