package Logic_Building;

public class Pizzaa {
    private int price,BasePizzaPrice;
    private boolean isExtraCheesAdded=false,isExtraToppingsAdded=false,isOpted=false,veg;
    private int extraCheesePrice=100;
    private int ExtraToppingsPrice=150;
    private int backPack=20;

    public Pizzaa(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }else {
            this.price=400;
        }
        BasePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheesAdded=true;
       // System.out.println("extra cheese added");
        this.price+=extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;
       // System.out.println("Extra toppings added");
        this.price+=ExtraToppingsPrice;
    }
    public void takeAway(){
        isOpted=true;
        //System.out.println("take away opted");
        this.price+=backPack;
    }
    public void getBill(){
//        System.out.println(this.price);
        String bill="";
        System.out.println("pizza : "+BasePizzaPrice);
        if(isExtraCheesAdded){
            bill+="Extra cheese added : "+extraCheesePrice+"Rs.\n";
        } if(isExtraToppingsAdded){
            bill+="Extra Toppings added : "+ExtraToppingsPrice+"Rs.\n";
        } if(isOpted){
            bill+="Take away"+backPack+"\n";
        }
        bill+="Bill : "+this.price+"Rs\n";
        System.out.println(bill);
    }
    public void getPizzaPrice(){
        System.out.println(this.price);
    }
}
 class Main{
     public static void main(String[] args) {
         Pizzaa basePizza=new Pizzaa(true);
//         basePizza.getPizzaPrice();
         basePizza.addExtraToppings();
         basePizza.addExtraCheese();
//         basePizza.takeAway();
         basePizza.getBill();
     }
}