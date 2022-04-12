package _05_Searching;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {4, 6, 12, 23, 53, 55, 57, 67};
        int target = 51;

        if(target > arr[arr.length-1]){
            System.out.println("No Ceiling of Number is present in Array.");
            return;
        }

        int s = 0;
        int e = arr.length-1;


        while (s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
            else {
                System.out.println("Ceiling of number is: " + arr[mid]);
                break;
            }
        }
        if(e<s){
            System.out.println("Ceiling of number is: " + arr[s]);
        }
    }
}
