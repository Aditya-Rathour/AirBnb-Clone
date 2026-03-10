package com.adityarathour.AirbnbApp.strategy;

import com.adityarathour.AirbnbApp.Entity.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class SurgePricingStrategy implements PricingStrategy {
    private final PricingStrategy wrapped;
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return  wrapped.calculatePrice(inventory).multiply(inventory.getSurgeFactor());
    }
}
