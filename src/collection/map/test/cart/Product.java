package collection.map.test.cart;

import java.util.Objects;

public class Product {

    private String name;
    private int price;

    // 코드 작성

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {                                   // equals and hashcode가 없으면 중복을 못 잡아낸다
        if (o == null || getClass() != o.getClass()) return false;      // new로 생성하면 주소값이 다 다르다고 생각하기 때문
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
