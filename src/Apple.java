import javax.management.remote.SubjectDelegationPermission;

public class Apple extends Fruits{
    private Double price;
    public Apple() {
        this.price = 8.0;
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
