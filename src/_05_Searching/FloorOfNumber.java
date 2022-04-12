package _05_Searching;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {4, 6, 12, 23, 53, 55, 57, 67};
        int target = 1;

        int s = 0;
        int e = arr.length-1;

        if(target < arr[0]){
            System.out.println("No Floor value of Number is present in Array.");
            return;
        }

        while (s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
            else {
                System.out.println("Floor value of number is: " + arr[mid]);
                break;
            }
        }
        if(e<s){
            System.out.println("Floor value of number is: " + arr[e]);
        }
    }
}
