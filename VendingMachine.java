import java.util.ArrayList;
import java.util.List;
import Products.Product;

public class VendingMachine {

    private int vol;    
    
    private List<Product> list = new ArrayList<>();
    private List<String> log;
    private int amount = 0;

   

    public VendingMachine(int vol){
        list = new ArrayList<Product>();
        this.vol = vol;
        log = new ArrayList<String>();
    }

    public VendingMachine addProduct(Product product) {
        list.add(product);
        return this;
    }

    public int getAmount() {
        return amount;
    }       

    public List<Product> getList() {
        return list;
    }

    public Product findProduct(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product) {
        try {
            Product prodFound = findProduct(product.getName());
            getList().remove(prodFound);
            amount += prodFound.getCost();
            return prodFound;

        } catch (Exception ex) {
            throw new RuntimeException("Product not found");

        }
    }

    public void addSales(String line){
        log.add(line);
    }
}