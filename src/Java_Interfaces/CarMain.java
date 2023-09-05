package Java_Interfaces;
interface Cars{
    void PurchaseCar(String CarName);
}
class Audi implements Cars{

    @Override
    public void PurchaseCar(String CarName) {
        System.out.println("i want to purchase "+CarName);
    }
}
class BMW implements Cars{
    public void PurchaseCar(String CarName){
       System.out.println("i want to purchase "+CarName);
    }
}
class Showroom{
    public Cars getcar1(String Carname){
        if(Carname.endsWith("Audi")){
            return new Audi();
        }
        else if(Carname.endsWith("BMW")){
            return new BMW();
        }
        else{
            return null;
        }
    }
}
public class CarMain{
    public static void main(String[] args) {
        String CarName=" Audi";

        Showroom s= new Showroom();
        Cars car=s.getcar1(CarName);
        if(s!=null){
            car.PurchaseCar(CarName);
        }
    }
}
