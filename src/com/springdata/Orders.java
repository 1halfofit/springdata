package com.springdata;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "jpa_orders")
@Entity
public class Orders {
    private int id;
    private String dis;
//@GenericGenerator(name = "uuid",parameters ={@`})
    @GeneratedValue
    @Id
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", dis='" + dis + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
}
