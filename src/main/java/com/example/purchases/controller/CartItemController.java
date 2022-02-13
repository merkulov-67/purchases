package com.example.purchases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.purchases.model.CalcCartItem;
import com.example.purchases.model.CartItem;
import com.example.purchases.service.CartItemService;

@RestController
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;
    
    @PostMapping(value = "/calculate")
    public ResponseEntity<CalcCartItem> calcCartItem(@RequestBody CartItem cartItem) {
    	CalcCartItem calcCartItem = cartItemService.CalculationCartItem(cartItem);
        return calcCartItem != null
                ? new ResponseEntity<>(calcCartItem, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
