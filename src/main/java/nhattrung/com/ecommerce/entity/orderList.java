/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhattrung.com.ecommerce.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="orderlist")
public class orderList implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;
    
    @Column(name = "orderDate")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date orderDate;
    
    @Column(name = "promotionCode")
    private String promotionCode;
    @Column(name = "amount")
    private int amount;
    
    @Column(name = "expires")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date expires;
    
    @OneToMany(mappedBy = "orderLists",fetch = FetchType.EAGER)
    private List<OrderDetails> orderDetailses;
    
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    public orderList() {
    }

    public orderList(int orderId, Date orderDate, String promotionCode, int amount, Date expires, List<OrderDetails> orderDetailses, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.promotionCode = promotionCode;
        this.amount = amount;
        this.expires = expires;
        this.orderDetailses = orderDetailses;
        this.customer = customer;
    }

    

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }
    
    
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public List<OrderDetails> getOrderDetailses() {
        return orderDetailses;
    }

    public void setOrderDetailses(List<OrderDetails> orderDetailses) {
        this.orderDetailses = orderDetailses;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
