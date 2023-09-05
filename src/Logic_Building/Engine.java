package Logic_Building;

public abstract class Engine{

   public abstract void run();
   public abstract void powerOutput(int power);
   public abstract void fuelType(String fuel);
   public abstract void Configuration();


}
class DieselEngine extends Engine{

   @Override
   public void run() {
      System.out.println("Diesel Engine running.......");
   }

   @Override
   public void powerOutput(int power) {
       System.out.println("Diesel Engine have "+power+"hp power");
   }

   @Override
   public void fuelType(String fuel) {
       System.out.println("Diesel engin uses "+fuel+" Fuel");
   }

   @Override
   public void Configuration() {
        System.out.println("diesel Engine have  intermittent-combustion piston-cylinder");
   }
}
class PertolEngine extends Engine{

    @Override
    public void run() {
        System.out.println("Petrol Engine running.......");
    }

    @Override
    public void powerOutput(int power) {
        System.out.println("Petrol Engine have "+power+"cc power");
    }

    @Override
    public void fuelType(String fuel) {
        System.out.println("Petrol engin uses "+fuel+"Fuel");
    }

    @Override
    public void Configuration() {
        System.out.println("Petrol Engine have Flat type engine");
    }
}
class ElectricEngine extends Engine{
    @Override
    public void run() {
        System.out.println("Electric engine Engine Engine running.......");
    }

    @Override
    public void powerOutput(int power) {
        System.out.println("Electric engine Engine have "+power+"kilovat power");
    }

    @Override
    public void fuelType(String fuel) {
        System.out.println("Electric engine  uses "+fuel);
    }

    @Override
    public void Configuration() {
        System.out.println("Electric  Engine have straight line engine");
    }

}
class Car {
    public static void main(String[] args) {
        DieselEngine de=new DieselEngine();
        de.run();
        de.powerOutput(200);
        de.fuelType(" Diesel ");
        de.Configuration();
        System.out.println("\n");

        PertolEngine pe=new PertolEngine();
        pe.run();
        pe.powerOutput(1000);
        pe.fuelType(" petrol ");
        pe.Configuration();
        System.out.println("\n");

        ElectricEngine ee=new ElectricEngine();
        ee.run();
        ee.powerOutput(100);
        ee.fuelType(" electricity ");
        ee.Configuration();
        System.out.println("\n");
    }
}
