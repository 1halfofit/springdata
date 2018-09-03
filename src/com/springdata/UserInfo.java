package com.springdata;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "jpa_user")
@Entity
public class UserInfo {
    private Integer id;
    private String name;
    private Date birth;
    private List<Orders> orders;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "userinfo_id")
    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", length = 32, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
