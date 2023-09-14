public class First{
    public static void main(String args[]){
        System.out.println("Hello World");
        int arr[] = {5,8,3,4,9,2};
        int target = 6;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[i]+arr[j])==target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}