/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.Connection;
import edu.ijse.mvc.DBConnection.DBConnection;
import edu.ijse.mvc.dto.customerDto;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CustomerModel {
    
    public List<customerDto> getAll() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery(sql);
        List <customerDto> customerDtos = new ArrayList<>();
        
        while(rst.next()){
            
            customerDto dto = new customerDto(
             rst.getString(1), 
             rst.getString(2),
             rst.getString(3),
             rst.getString(4),
             rst.getDouble(5),
             rst.getString(6),
             rst.getString(7),
             rst.getString(8),
             rst.getString(9));
            
            customerDtos.add(dto);
        }
        return customerDtos;
    }
    
    public customerDto searchCustomer(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            customerDto customerDto = new customerDto();
            customerDto.setId(rst.getString("CustID"));
            customerDto.setTitle(rst.getString("CustTitle"));
            customerDto.setName(rst.getString("CustName"));
            customerDto.setBod(rst.getString("DOB"));
            customerDto.setSalary(rst.getDouble("Salary"));
            customerDto.setAddress(rst.getString("CustAddress"));
            customerDto.setCity(rst.getString("City"));
            customerDto.setProvinve(rst.getString("Province"));
            customerDto.setPostalcode(rst.getString("PostalCode"));
            
            return customerDto;
        }
        return null;
        
    }
    
    public String saveCustomer(customerDto dto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, dto.getId());
        statement.setString(2, dto.getTitle());
        statement.setString(3, dto.getName());
        statement.setString(4, dto.getBod());
        statement.setDouble(5, dto.getSalary());
        statement.setString(6, dto.getAddress());
        statement.setString(7, dto.getCity());
        statement.setString(8, dto.getProvinve());
        statement.setString(9, dto.getPostalcode());
        
        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";
                
    }
    
    public String updateCustomer(customerDto dto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHRERE CustID = ?;";
        PreparedStatement statement = connection.prepareStatement(sql); 
        

        statement.setString(1, dto.getTitle());
        statement.setString(2, dto.getName());
        statement.setString(3, dto.getBod());
        statement.setDouble(4, dto.getSalary());
        statement.setString(5, dto.getAddress());
        statement.setString(6, dto.getCity());
        statement.setString(7, dto.getProvinve());
        statement.setString(8, dto.getPostalcode());
        statement.setString(9, dto.getId());
        
         int resp = statement.executeUpdate();
        return resp > 0 ? "Updated" : "Fail";
    }
    
    public String deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM customer WHERE CustID = ? LIMIT 1;";
        PreparedStatement statement = connection.prepareStatement(sql); 
        
        statement.setString(1, id);
        
        int resp = statement.executeUpdate();
        return resp > 0 ? "Deleted" : "Fail" ;
        
    }
}
