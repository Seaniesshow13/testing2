package labsheet7.sampleprogram1.exercise1;

import labsheet7.sampleprogram1.exercise1.Product;

public class LineItem {
    private int id;
    private int quantity;
    private Product product;

    public LineItem(int id, int quantity , Product product){
        setId(id);
        setQuantity(quantity);
        setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "LineItem Details are as follows : \n\nId" + getId() + "/nquantity: " + getQuantity() + "\n " + getProduct() + "\n\n";
    }
}
