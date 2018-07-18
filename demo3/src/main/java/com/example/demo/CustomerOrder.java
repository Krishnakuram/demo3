package com.example.demo;

import javax.persistence.*;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "itemname")
    private String itemName;
    private String image;
    private int price;
    private int quantity;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
