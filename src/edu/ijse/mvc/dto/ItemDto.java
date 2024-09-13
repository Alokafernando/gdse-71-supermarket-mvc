/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author user
 */
public class ItemDto {
    private String ItemCode;
    private String Desciption;
    private String PackSize;
    private double UnitPrice;
    private int qoh;

    public ItemDto() {
    }

    public ItemDto(String ItemCode, String Desciption, String PackSize, double UnitPrice, int qoh) {
        this.ItemCode = ItemCode;
        this.Desciption = Desciption;
        this.PackSize = PackSize;
        this.UnitPrice = UnitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the Desciption
     */
    public String getDesciption() {
        return Desciption;
    }

    /**
     * @param Desciption the Desciption to set
     */
    public void setDesciption(String Desciption) {
        this.Desciption = Desciption;
    }

    /**
     * @return the PackSize
     */
    public String getPackSize() {
        return PackSize;
    }

    /**
     * @param PackSize the PackSize to set
     */
    public void setPackSize(String PackSize) {
        this.PackSize = PackSize;
    }

    /**
     * @return the UnitPrice
     */
    public double getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "ItemCode=" + ItemCode + ", Desciption=" + Desciption + ", PackSize=" + PackSize + ", UnitPrice=" + UnitPrice + ", qoh=" + qoh + '}';
    }

    
    
}
