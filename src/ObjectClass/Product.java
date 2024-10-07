package ObjectClass;

public class Product {
    public static void main(String[] args) {
        class ProductInfo {
            int productId;
            String productName;

            public ProductInfo(int productId,String productName) {
                this.productId = productId;
                this.productName=productName;
            }
        }
       ProductInfo productInfo1 = new ProductInfo(1,"laptop");
        ProductInfo productInfo2 = new ProductInfo(1,"laptop");
        ProductInfo productInfo3 = productInfo1;

        System.out.println("using == operator");

        System.out.println(productInfo1 == productInfo2);
        System.out.println(productInfo2 == productInfo3);
        System.out.println(productInfo1 == productInfo3);

        System.out.println("using equals()");

        System.out.println(productInfo1.equals( productInfo2));
        System.out.println(productInfo2.equals(productInfo2));
        System.out.println(productInfo1.equals(productInfo3));

    }
}
