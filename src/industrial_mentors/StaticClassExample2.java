package industrial_mentors;

 class StaticExample3
    {
        static
        {
            System.out.println("Executing Static Block.");
        }
        public final int abc=20;

        public int getabc(){
            return abc;
        }
    }

    public class StaticClassExample2
    {
        public static void main(String[] args)
        {
            System.out.println(new StaticExample3().abc);
        }
    }

