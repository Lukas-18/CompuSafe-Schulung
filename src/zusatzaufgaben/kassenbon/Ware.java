package zusatzaufgaben.kassenbon;

public class Ware {

    String name;
    double price;

    public Ware(String name, double price){
        this.name = name;
        this. price = price;
    }

    public void printNameAndPrice(){
        System.out.println(this.name + ": " + this.price + "€ ");
    }
}
