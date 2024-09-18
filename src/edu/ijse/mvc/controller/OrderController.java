/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderModel;

    
/**
 *
 * @author user
 */
public class OrderController {
    
    private OrderModel ORDER_MODEL = new OrderModel(); 
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        String resp = ORDER_MODEL.placeOrder(orderDto);
        return resp;
    }
}
