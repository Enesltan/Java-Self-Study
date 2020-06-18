public class Product {
    //Constructor
    public Product(int id,String name,String description,double price,int amount){
        System.out.println("Parametreli Constructor çalıştı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price=price;
        this.amount=amount;
    }
    public Product(){
        System.out.println("Constructor çalıştı.");
    }
    // attribute veya field
    private int id;
    private String name;
    private String description;
    private double price;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    /*
     * Not: private sadece tanımlandığı blokta geçerlidir demek*/

}
