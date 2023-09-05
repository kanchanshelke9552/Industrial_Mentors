package ArrayProgrammes;
// printing the program to show elements on even position
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={10,11,12,13,14,15,16,17,18,19};
        System.out.println("the elements on even position : ");
        for (int i=0;i<arr.length;i=i+2){

                System.out.println(arr[i+1]);

        }
    }
}
