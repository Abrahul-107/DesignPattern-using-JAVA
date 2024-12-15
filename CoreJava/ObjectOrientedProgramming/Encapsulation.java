package CoreJava.ObjectOrientedProgramming;

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Product mobile = new Product(12, "Samsung", 28000, 1);
        System.out.println(mobile.getItemNo());
        System.out.println(mobile.getName());
        System.out.println(mobile.getPrice(289000));
        Customer me = new Customer(107, "Rahul", "Odisha", "6372716670");
        System.out.println(me.getPhoneno());
        System.out.println(me.getAdreess());
        System.out.println(me.getName());
        System.out.println(me.getId());
    }
}

class Customer {
    private int id;
    private String name;
    private String address;
    private String phoneno;

    public Customer(int idd, String namee, String add, String phn) {
        id = idd;
        name = namee;
        address = add;
        phoneno = phn;

    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public String getAdreess() 
    {
        return address;
    }

    public String getPhoneno() 
    {
        return phoneno;
    }

}

class Product {
    private int itemNo;
    private String name;
    @SuppressWarnings("unused")
    private double price;
    private int quantity;

    public Product(int itmNo, String namee, double price, int qty) {
        itemNo = itmNo;
        name = namee;
        setPrice(price);
        setQuantity(qty);
    }

    public void setPrice(double pricee) 
    {
        this.price = pricee;
    }

    public double getPrice(double price) 
    {
        return price;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public String getName() 
    {
        return name;
    }

    public int getItemNo() 
    {
        return itemNo;
    }
}
