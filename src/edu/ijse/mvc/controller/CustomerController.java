/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.customerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CustomerController {
    
    private static CustomerModel CUSTOMER_MODEL;
    
    public CustomerController(){
        CUSTOMER_MODEL = new CustomerModel();
    }
    
    public List<customerDto> getAll()throws SQLException, ClassNotFoundException{
        List<customerDto> dto = CUSTOMER_MODEL.getAll();
        return dto;
    }
    
    public customerDto searchCustomer(String id) throws ClassNotFoundException, SQLException{
        customerDto dto = CUSTOMER_MODEL.searchCustomer(id);
        return dto;
    }
  
    public String saveCustomer(customerDto dto) throws ClassNotFoundException, SQLException{
        String resp = CUSTOMER_MODEL.saveCustomer(dto);
        return resp;          
    }
    
    public String updateCustomer(customerDto dto) throws ClassNotFoundException, SQLException{
        String resp = CUSTOMER_MODEL.updateCustomer(dto);
        return resp;
    }
    
    public String deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        String resp = CUSTOMER_MODEL.deleteCustomer(id);
        return resp;
    }
}
