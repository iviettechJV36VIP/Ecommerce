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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name ="customer")
public class Customer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int customerId;
    @Column(name = "customerFirstName")
    private String customerFirstName;
    
    @Column(name = "customerLastName")
    private String customerLastName;
    
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private int phone;
    
    @Column(name = "customerAddress")
    private String customerAddress;
    
    @Column(name = "customerDistrict")
    private String customerDistrict;
    
    @Column(name = "customerCity")
    private String customerCity;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<orderList> orderLists;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<AccountRole> accountRoles;

    public Customer() {
    }

    public Customer(int customerId, String customerFirstName, String customerLastName, Date birthdate, String sex, String email, int phone, String customerAddress, String customerDistrict, String customerCity, String username, String password, List<orderList> orderLists, List<AccountRole> accountRoles) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.birthdate = birthdate;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.customerAddress = customerAddress;
        this.customerDistrict = customerDistrict;
        this.customerCity = customerCity;
        this.username = username;
        this.password = password;
        this.orderLists = orderLists;
        this.accountRoles = accountRoles;
    }

    

    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerDistrict() {
        return customerDistrict;
    }

    public void setCustomerDistrict(String customerDistrict) {
        this.customerDistrict = customerDistrict;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<orderList> getOrderLists() {
        return orderLists;
    }

    public void setOrderLists(List<orderList> orderLists) {
        this.orderLists = orderLists;
    }


    public List<AccountRole> getAccountRoles() {
        return accountRoles;
    }

    public void setAccountRoles(List<AccountRole> accountRoles) {
        this.accountRoles = accountRoles;
    }

    
    
    

    
    
    
    
}
