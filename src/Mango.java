public class Mango extends Fruits{
    private Double price;

    public Mango() {
        this.price = 20.0;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }
}
