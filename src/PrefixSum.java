import java.util.Scanner;

public class PrefixSum {
    public static int[] prefixSum(int arr[]){
    for(int i=1;i<arr.length;i++){
        arr[i]=arr[i-1]+arr[i];
    }
    return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int ans[]=prefixSum(arr);
        for(int j=0;j<ans.length;j++){
            System.out.println(ans[j]);
        }


    }
}