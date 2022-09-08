package com.lab11.service;

import java.util.List;
import com.lab11.entities.Mobile;
import com.lab11.entities.PurchaseDetails;
import com.lab11.exception.EntityNotFoundException;

public interface MobilePurchaseService {

	PurchaseDetails insertPurchaseDetails(PurchaseDetails obj);
	Mobile updateMobileQuantity(int id);
	List <Mobile>listAllMobiles();
	Mobile listMobileById(int a)  throws EntityNotFoundException;
	List listByPriceRange(double a,double b)  throws EntityNotFoundException;	
	
}
