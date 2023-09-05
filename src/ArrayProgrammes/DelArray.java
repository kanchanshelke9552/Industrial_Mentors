package ArrayProgrammes;

public class DelArray {
    public static void main(String[] args) {
        int[] a= new int[]{10, 20, 30, 40, 50, 60};

        int del=30;

        int count =0;
        for(int i=0; i<a.length;i++){
            if(del==a[i]){
                for(int j=i; j<a.length-1; j++){
                    a[j]=a[j+1];
                }
                count=count+1;
                break;
            }
        }
        if(count==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element Deleted Successfully");
            for(int i=0; i<a.length-1;i++){
                System.out.println(a[i]+" ");
        }

        }
    }
}
