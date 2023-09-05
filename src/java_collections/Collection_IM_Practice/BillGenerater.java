package java_collections.Collection_IM_Practice;

import java.util.ArrayList;
import java.util.List;

class Products{
    String Products;
    double price;


    public Products(String products,double price) {
        this.price = price;
        Products = products;
    }

    public double getPrice() {
        return price;
    }

    public String getProducts() {
        return Products;
    }
}
public class BillGenerater {
    static List<Products> list=new ArrayList<>();

    public void generateBill(){
        double total=0.0;
        for (Products product : list) {
            System.out.println(product.getProducts() + " : $" + product.getPrice());
            total += product.getPrice();
        }
    }
    public void buyProduct(){

    }
    public static void main(String[] args) {
         BillGenerater bill=new BillGenerater();
        list.add(new Products("suger",40));
        list.add(new Products("oil",160));
        list.add(new Products("besan",65));
        list.add(new Products("shabudana",45));
        list.add(new Products("jira",122));
        list.add(new Products("butter",170));
        list.add(new Products("chanaDaal",78));
        list.add(new Products("toorDaal",65));

         bill.generateBill();
    }

}
