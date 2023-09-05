package sorting_Practice;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int[] a={10,20,5,57,19};
        int temp;

        for(int i=0; i<a.length; i++){
            int FLAG=0;
            for(int j=0; j<a.length-1-i;j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    FLAG = 1;
                }
            }
            if(FLAG==0){
                break;
            }

        }
        System.out.print("Sorted list is = ");
        for(int i=0; i<a.length; i++){

            System.out.print(+a[i]+" ");
        }

    }

}
