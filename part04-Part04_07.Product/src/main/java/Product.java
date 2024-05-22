public class Product {
    private String name;
    private Double initprice;
    private int initquant;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.initprice = initialPrice;
        this.initquant = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", " + " price " + initprice + ", " + initquant + " pcs");
    }

}
