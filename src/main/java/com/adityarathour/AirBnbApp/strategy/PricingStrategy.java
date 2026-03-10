package com.adityarathour.AirbnbApp.strategy;

import com.adityarathour.AirbnbApp.Entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
