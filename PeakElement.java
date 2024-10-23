import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean flag = false;
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Now enter the elements of array");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            array[i] = x;
        }
        for(int i=1; i<n-1; i++){
            if(array[i] > array[i-1] && array[i] > array[i+1]){
                System.out.println("Peak element is -> "+array[i]);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Peak element not present");
        }
        sc.close();
    }
}
