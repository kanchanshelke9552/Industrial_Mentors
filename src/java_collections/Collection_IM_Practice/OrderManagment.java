package java_collections.Collection_IM_Practice;

import java.util.HashMap;
import java.util.Map;

class Order{
  String orderID;
  String orderState;

    public Order() {
    }

    public Order(String orderID, String orderState) {
        this.orderID = orderID;
        this.orderState = orderState;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getOrderState() {
        return orderState;
    }
}
public class OrderManagment {
    Map<String,Order> order=new HashMap<>();

    public void add(Order ord){
        order.put(ord.getOrderID(),ord);
    }

    public void updateStates(String id,String state){
        Order update=order.get(id);
        update.orderState = state;
    }
    public static void main(String[] args) {
        Order d=new Order("101","Delivered");
       Order a=new Order("101","Resistration");

        Order c=new Order("103","Pending");
        Order b=new Order("102","Dispatched");


        OrderManagment orders=new OrderManagment();
        orders.add(a);
        orders.add(d);
        orders.add(c);
        orders.add(b);

        orders.updateStates("103","Delivered");

        System.out.println("Current Order States :");
      //  System.out.println("Order ID: " + o.getOrderID() + ", State: " + o.getOrderState());

        for (Order order : orders.order.values()) {
            System.out.println("Order ID: " + order.getOrderID() + ", State: " + order.getOrderState());
        }
    }
}
