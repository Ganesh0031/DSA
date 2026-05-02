package SystemDesign;

import RecurssionP.PowerRent;

import java.util.ArrayList;
import java.util.List;

class Product{
    private Long price;
    private String name;
    public Product(){}

    public Product(Long price, String name) {
        this.price = price;
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
class ShoppingCart{
    List<Product> products=new ArrayList<>();

   public void addProduct(Product p){
      products.add(p);
   }
   public List<Product>getProduct(){
       return products;
   }
   public long calculatePrice(){
       int price=0;

       for(Product p:getProduct()){
           price+=p.getPrice();
       }
       return price;
   }
}
 class CartInvoice{
    private ShoppingCart cart;
    public CartInvoice (ShoppingCart cart){
        this.cart=cart;
    }
    public void printInvoice(){

        System.out.println("name"+"    "+"price");
        for(Product cart1:cart.getProduct()){
            System.out.println(cart1.getName()+"   "+cart1.getPrice());
        }

        System.out.println("The total Price is ");
        System.out.println("Price ::"+cart.calculatePrice());
    }
}
 abstract  class SavedDatabase{

    abstract public   void savedDB();
}
class SaveToMongoDb extends SavedDatabase {
    private ShoppingCart cart;

    public SaveToMongoDb(ShoppingCart cart) {
        this.cart = cart;
    }

    public void savedDB() {
        Product p = new Product();
        System.out.println("Here saved in MongoDBdb");
        for (Product p1 : cart.getProduct()) {
            p.setName(p1.getName());
            p.setPrice(p1.getPrice());
            System.out.print(p.getName() + " ");
            System.out.println(p.getPrice());

        }
        System.out.println("Successfully saved");


    }
}
    class SaveToSQL extends SavedDatabase{
        private  ShoppingCart cart;
        public  SaveToSQL(ShoppingCart cart){
            this.cart=cart;
        }

        public   void savedDB(){
            Product p=new Product();
            System.out.println("Here saved in SQl");
            for(Product p1:cart.getProduct()){
                p.setName(p1.getName());
                p.setPrice(p1.getPrice());
                System.out.print(p.getName()+" ");
                System.out.println(p.getPrice());

            }
            System.out.println("Successfully saved");


        }
        }


public class SolidPricipal {
    public static void main(String[] args) {
        Product p=new Product(500L, "car");
        Product p2=new Product(1000L,"Halcatiop");
        ShoppingCart s=new ShoppingCart();
        s.addProduct(p);
        s.addProduct(p2);
        System.out.println(s.getProduct());
        System.out.println(s.calculatePrice());
        CartInvoice c=new CartInvoice(s);
        c.printInvoice();
        SavedDatabase s1=new SaveToSQL(s);
        s1.savedDB();


    }
}
