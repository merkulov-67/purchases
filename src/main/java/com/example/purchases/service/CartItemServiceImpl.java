package com.example.purchases.service;

import java.util.List;



import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.purchases.model.CalcCartItem;
import com.example.purchases.model.CartItem;
import com.example.purchases.model.Product;

@Service
public class CartItemServiceImpl  implements CartItemService{

	@Override
	public CalcCartItem CalculationCartItem(CartItem item) {
		List<Product> productList = item.getListItem(); 
		float totalSumma = 0;
		for(Product product : productList) {
			
		 float price = getPrice(product.getId());
		 product.setSumma(product.getQuantity()*price);
		 totalSumma += product.getQuantity()*price;
		}
		CalcCartItem calcCartItem = new CalcCartItem();
		calcCartItem.setTotalSumm(totalSumma);
		calcCartItem.setListItem(productList);
		return calcCartItem;
	}
	@Cacheable("price")
	private float getPrice(int id) {
		// получение цены товара
		return 0;
	}
	//метод будет вызываться раз в 24 часа
    @Scheduled(fixedRate = 86400000)
    @Async
    @CacheEvict(value="price",allEntries=true)
    public void clearСache() { 
     
    	 ///очистка кэша
    }
}
