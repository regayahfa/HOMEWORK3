import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ///Q1
        int[] Arr = {50, -20, 0, 30, 40, 60, 10};
        System.out.println(Arr.length >= 2 && Arr[0] == Arr[Arr.length - 1]);
        ///
        // ///
        // ///
        // Q2
        Integer[] Ar2 = new Integer[]{1, 4, 17, 7, 25, 5, 100};
        int x = 3;
        System.out.println(x + " largest elements of the said array are:");
        for (int i = 0; i < x; i++) {
            System.out.print(Ar2[i] + " ");
        }

        //
        //
        //Q3
        Integer num[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        double average = sum / num.length;
        System.out.println("The average of the said array is: " + average);
        System.out.print("The number in the said array that are greater than the average are:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] > average) {
                System.out.println(num[i]);
            }
        }

        //
        //
        //Q4
        int[] array_numb = {20, 30, 40};
        int max_val = array_numb[0];
        if (array_numb[2] >= max_val)
            max_val = array_numb[2];
        System.out.println("larger value: " + max_val);
        //
        //
        //
        //Q5
        int[] array_numbb = {20, 30, 40};
        int z = array_numbb[0];
        array_numbb[0] = array_numbb[array_numbb.length - 1];
        array_numbb[array_numbb.length - 1] = z;
        System.out.println("new array after swaping the first and last elements: "
                + Arrays.toString(array_numbb));
        //
        //
        //
        //6
        ArrayList anim = new ArrayList();

        anim.add("cat");
        anim.add("dog");
        anim.add("red");
        anim.add("is");
        anim.add("am");
        anim.remove("is");
        anim.remove("am");

        System.out.println("result" + anim.toString());

        ///
        ///
        ///Q7
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (s.hasNextInt()) {
            arr_size = s.nextInt();
        }
        int[] arr = new int[arr_size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr_size; i++) {
            if (s.hasNextInt()) {
                arr[i] = s.nextInt();

                System.out.println(
                        "The elements of the array are: ");
                for (int i = 0; i < arr_size; i++) {
                    System.out.print(arr[i] + " ");
                }
                s.close();
            }
            ///
            ///
            ///Q8


            ///
            ///
            ///Q9

            //
            ///
            ///Q10
            int[] arr1 = new int[]{2, 3, 6, 6, 4};
            int[] arr2 = new int[]{2, 3, 6, 6, 4};
            System.out.println(Arrays.equals(arr1, arr2));
        }
    }
}}}
