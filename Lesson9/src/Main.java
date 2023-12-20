import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int index = 2;
//        Ex1(arr, index);
//        Should Change the value of index 2 (3) to 4

//        Ex2();

//        Ex3();

//        int[] arr = {1, 5, 3, 4, 5, 7};
//        Ex4(arr);

//        Ex5(30);

//        Ex6();

//        Ex7();
    }

    public static void Ex1(int[] arr, int index)
    {
        if (arr[index] % 2 != 0)
        {
            arr[index]++;
        }
    }

    public static void Ex2()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            sum += num;
            arr[i] = num;
        }

        int avg = sum / arr.length;
        System.out.println("Average: " + avg);
    }

    public static void Ex3()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minNumber)
            {
                minNumber = arr[i];
            }
        }

        System.out.println("Min: " + minNumber);
    }

    public static void Ex4(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                System.out.println(arr[i] + ", " + arr[i + 1]);
            }
        }
    }

    public static void Ex5(int x)
    {
       int arr[] = new int[10];
       boolean isFound = false;
       Random rand = new Random();
       for (int i = 0; i < arr.length; i++)
       {
           arr[i] = rand.nextInt(100);
           System.out.println(arr[i]);
           if (arr[i] == x)
           {
               isFound = true;
           }
       }

        if (isFound)
        {
            System.out.println("The number " + x + " found");
        }
        else
        {
            System.out.println("The number " + x + " wasn't found");
        }
    }

    public static void Ex6()
    {
        int arr[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1]) % 2 == 0) {
                System.out.println(arr[i] + ", " + arr[i + 1]);
            }
        }
    }

    public static void Ex7()
    {
        int arr[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i]);
            System.out.print(",");
        }


        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
}