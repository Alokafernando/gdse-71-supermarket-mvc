/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class ItemController {
    
    private ItemModel ITEM_MODEL;
    
    
    public ItemController(){
        ITEM_MODEL = new ItemModel();
    }
    
    public List<ItemDto> getAllItems() throws ClassNotFoundException, SQLException{
        List<ItemDto> dto = ITEM_MODEL.getAll();
        return dto;
    }
    
    public ItemDto search(String id) throws ClassNotFoundException, SQLException{
        ItemDto dto = ITEM_MODEL.seachItem(id);
        return dto;
    }
    
    public String save(ItemDto dto) throws ClassNotFoundException, SQLException{
        String resp = ITEM_MODEL.saveItem(dto);
        return resp;
    }
    
    public String update(ItemDto dto) throws ClassNotFoundException, SQLException{
        String resp = ITEM_MODEL.updateItem(dto);
        return resp;
    }
    
    public String delete (ItemDto dto) throws SQLException, ClassNotFoundException{
        String resp = ITEM_MODEL.deleteItem(dto);
        return resp;
    }
}
