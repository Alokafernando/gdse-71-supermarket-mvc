/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.DBConnection.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ItemModel {
    public List<ItemDto> getAll() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM item;";
        PreparedStatement statement =  connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        List<ItemDto> itemDtos = new ArrayList<>();
        
        while(rst.next()){
            
            ItemDto itemDto = new ItemDto(
                rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getDouble(4),
                rst.getInt(5));
            
            itemDtos.add(itemDto);
        }
        return itemDtos;
    }
    
    public ItemDto seachItem(String itemCode) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemCode);
        
        ResultSet rst = statement.executeQuery();
        
        if (rst.next()) {
            ItemDto dto = new ItemDto();
            dto.setItemCode(rst.getString("ItemCode"));
            dto.setDesciption(rst.getString("Description"));
            dto.setPackSize(rst.getString("PackSize"));
            dto.setUnitPrice(rst.getDouble("UnitPrice"));
            dto.setQoh(rst.getInt("QtyOnHand"));
            
            return dto;
        }
        return null;
    }
    
    public String saveItem(ItemDto dto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO item VALUES (?, ?, ?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
 
        statement.setString(1, dto.getItemCode());
        statement.setString(2, dto.getDesciption());
        statement.setString(3, dto.getPackSize());
        statement.setDouble(4, dto.getUnitPrice());
        statement.setInt(5, dto.getQoh());
        
        int resp = statement.executeUpdate();
        return resp > 0 ? "Save Successful" : "Failed";
    }
    
    public String updateItem(ItemDto dto) throws ClassNotFoundException, SQLException{
     Connection connection = DBConnection.getInstance().getConnection();
     String sql = "UPDATE item SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?;";
     PreparedStatement statement = connection.prepareStatement(sql);
     
     statement.setString(1, dto.getDesciption());
     statement.setString(2, dto.getPackSize());
     statement.setDouble(3, dto.getUnitPrice());
     statement.setInt(4, dto.getQoh());
     statement.setString(5, dto.getItemCode());
     
     int resp = statement.executeUpdate();
     return resp > 0 ? "Update successful" : "Failed";
    }
    
    public String deleteItem(ItemDto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM item WHERE ItemCode = ? LIMIT 1;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, dto.getItemCode());
        
        int resp = statement.executeUpdate();
        return resp > 0 ? "Delete Successful" : "Faild";
    }
}
