package ObjectClass.Final;

import lombok.AllArgsConstructor;

public class ProductDemo {
    public static void main(String[] args) {

        class Product {
            int product_Id;
            String product_name;
            int Product_Price;

            @Override
            protected void finalize () throws Throwable {
                System.out.println("Finalize method");
            }
        }

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = product1;

        product1=null;
        product2=null;
        product3=null;

        System.gc();
        System.out.println("rest of main method ");
    }
}
