package Products;

public class Product {

    private String name;
    private Integer cost;    

    public Product(String name, Integer cost) {
        if (name == "") {
            throw new IllegalStateException(String.format("У продукта отсутствует наивенование!"));
        } else {
            this.name = name;
            this.cost = cost;
        }
    }   

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer value) {

        if (value <= 0) {
            throw new IllegalStateException((String.format("Цена указана неверно!")));
        } else {
            this.cost = value;
        }
    }    

    @Override
    public String toString() {
        return "Product{"+
            "name ='"+name+'\''+
            ", cost = " + cost +
            '}';

    }
}