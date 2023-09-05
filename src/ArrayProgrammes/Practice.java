package ArrayProgrammes;

public class Practice{
    public static void main(String[] args) {
        int[] a = new int[30];
        int[] b = new int[15];

        for(int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        int indxs = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[indxs] = a[i];
                indxs++;
            }
        }
        System.out.println("element in second array........");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
