public class Main {

    public static void main(String[] args) {
        Product urun = new Product(1,"Laptop","Lenovo",125.50,50);
        Product urun2 = new Product();
        urun2.setId(2);
        urun2.setName("Masaüstü");
        urun2.setDescription("Casper");
        urun2.setPrice(123.4);
        urun2.setAmount(50);

        ProductManager manager = new ProductManager();
        manager.Add(urun);
        manager.Add(urun2);

        System.out.println(urun.getName());
        System.out.println(urun2.getName());

    }
}
