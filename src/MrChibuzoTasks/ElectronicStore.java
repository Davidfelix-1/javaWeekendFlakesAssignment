//package MrChibuzoTasks;
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//enum ElectronicStores {
//    ELECTRONICS, GROCERIES, UTENSILS, CLOTHING
//    }
//enum CardType {
//    MASTER_CARD, VISA_CARD, VERVE, AMERICAN_EXPRESS
//}
//
//class User{
//    private int age;
//    private String email;
//    private String homeAddress;
//    private String name;
//    private String password;
//    private String phone;
//
//
//    public User(int age, String email, String homeAddress, String name, String password, String phone){
//        this.age= age;
//        this.email= email;
//        this.homeAddress= homeAddress;
//        this.name= name;
//        this.password= password;
//        this.phone= phone;
//    }
//}
//
//class Customer extends User{
//
//    private ArrayList<BillingInformation> billingInfoList= new ArrayList<>();
//    private ShoppingCart shoppingCart = new ShoppingCart ();
//
//    public Customer(int age, String email, String homeAddress, String name, String password, String phone) {
//        super(age, email, homeAddress, name, password, phone);
//    }
//}
//
//
//class Seller extends User {
//    public Seller(int age, String email, String homeAddress, String name, String password, String phone) {
//        super(age, email, homeAddress, name, password, phone);
//    }
//}
//
//
//class Admin extends User {
//
//    public Admin(int age, String email, String homeAddress, String name, String password, String phone) {
//        super(age, email, homeAddress, name, password, phone);
//    }
//}
//
//class ShoppingCart{
//    private ArrayList<CartItem> items = new ArrayList<>();
//
//    public ShoppingCart(){
//        this.items= new ArrayList<>();
//    }
//    public void addItem(Product product, int quantity){
//        items.add(new CartItem(product, quantity));
//    }
//
//    public void removeItem(Product product){
//    }
//
//}
//class CartItem{
//    private Product product;
//    private int quantity;
//
//
//    public CartItem (Product product, int quantity){
//        this.product=product;
//        this.quantity=quantity;
//    }
//}
//class Product{
//    private int productId;
//    private String productName;
//    private double price;
//    private String productionDescription;
//    private ProductCategory category;
//
//    public Product(int productId, String productName, double price, String productionDescription, ProductCategory  category){
//        this.productId = productId;
//        this.productName=productName;
//        this.price= price ;
//        this.productionDescription= productionDescription;
//        this.category =category;
//    }
//
//}
//class BillingInformation{
//    private String receiverName;
//    private String deliveryAddress;
//    private String  receiverPhone;
//    private CreditCard creditCard;
//
//
//    public BillingInformation(String receiverName, String deliveryAddress, String receiverPhone, CreditCard creditCard){
//        this.receiverName= receiverName;
//        this.deliveryAddress= deliveryAddress;
//        this.receiverPhone= receiverPhone;
//        this.creditCard=creditCard;
//    }
//}
//
//class CreditCard{
//    private String cardCvv;
//    private String cardExpirationYear;
//    private String cardExpirationMonth;
//    private String nameOnCard;
//
//    private CardType cardType;
//
//    public CreditCard(String cardCvv, String cardExpirationYear, String cardExpirationMonth, String nameOnCard, CardType cardType){
//        this.cardCvv=cardCvv;
//        this.cardExpirationYear=cardExpirationYear;
//        this.cardExpirationMonth=cardExpirationMonth;
//        this.nameOnCard=nameOnCard;
//        this.cardType=cardType;
//
//    }
//
//}
//
//class Address{
//    private String cityName;
//    private String country;
//    private String houseNumber;
//    private String street;
//
//    private String state;
//
//
//    public Address(String cityName, String country, String houseNumber, String street, String state){
//
//        this.cityName=cityName;
//        this.country=country;
//        this.houseNumber=houseNumber;
//        this.street=street;
//        this.state=state;
//
//    }
//
//
//}
//
//   public class ElectronicStore{
//
//    public static void main(String[] args) {
//
//    }
//
//    }