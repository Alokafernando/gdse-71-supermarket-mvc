/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author user
 */
public class customerDto {
    private String id;
    private String title;
    private String name;
    private String bod;
    private double salary;
    private String address;
    private String city;
    private String provinve;
    private String postalcode;

    public customerDto() {
    }

    public customerDto(String id, String title, String name, String bod, double salary, String address, String city, String provinve, String postalcode) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.bod = bod;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.provinve = provinve;
        this.postalcode = postalcode;
    }

    /**
     * @return the it
     */
    public String getId() {
        return id;
    }

    /**
     * @param it the it to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bod
     */
    public String getBod() {
        return bod;
    }

    /**
     * @param bod the bod to set
     */
    public void setBod(String bod) {
        this.bod = bod;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the provinve
     */
    public String getProvinve() {
        return provinve;
    }

    /**
     * @param provinve the provinve to set
     */
    public void setProvinve(String provinve) {
        this.provinve = provinve;
    }

    /**
     * @return the postalcode
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * @param postalcode the postalcode to set
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "customerDto{" + "it=" + id + ", title=" + title + ", name=" + name + ", bod=" + bod + ", salary=" + salary + ", address=" + address + ", city=" + city + ", provinve=" + provinve + ", postalcode=" + postalcode + '}';
    }
    
    
    
}
