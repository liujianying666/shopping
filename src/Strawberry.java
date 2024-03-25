public class Strawberry extends Fruits{
    private Double price;

    public Strawberry() {
        this.price = 13.0;
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
