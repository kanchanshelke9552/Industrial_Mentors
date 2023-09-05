package Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws Exception{
        BufferedReader br=null;
        try {
            String str = "";
             br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        }catch (Throwable e) {
            System.out.println("Exception "+e);
        }
        finally {
            br.close();
        }
    }
}
