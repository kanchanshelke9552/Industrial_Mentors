package Exception_Handling;

import java.io.FileNotFoundException;

class AgeInvalidException extends RuntimeException
{
    public AgeInvalidException(String msg) {
        super(msg);
    }
}
public class Just {
    public static void validate(int age) throws AgeInvalidException

    {

        if(age>50)
        {
            System.out.println("Eligible for die");
        }
        else{
            throw new AgeInvalidException("Marjja");
        }
    }
    public void konti() throws FileNotFoundException
    {

        throw new AgeInvalidException("Hi");
    }

    public static void main(String[] args) {


        try {
            validate(32);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
