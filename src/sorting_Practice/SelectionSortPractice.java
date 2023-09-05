package sorting_Practice;

public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] arr={50,42,30,22,9,10};
        int orignal,temp=0;

        for(int i=0;i<arr.length;i++){
            orignal=i;
            for(int j=i+1; j<arr.length; j++){

               if(arr[j]<arr[orignal]){
                   orignal=j;

               }
            }
            temp=arr[i];
            arr[i]=arr[orignal];
            arr[orignal]=temp;
        }
        System.out.print("sorted elements is = ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
