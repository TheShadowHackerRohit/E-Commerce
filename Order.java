package com.example.e_commerce;

public class Order {

    public static  boolean placeOrder(Customer customer, Product product){
        try {
            //insert into orders(customers_id, product_id, status) values (1, 1 , 'Ordered');
            String placeOrder = "insert into orders(customers_id, product_id, status) values ("
                    + customer.getId()+","+ product.getId() + ", 'Ordered')";


            DataBaseConnection dbConn = new DataBaseConnection();

            return dbConn.insertUpdate(placeOrder);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
