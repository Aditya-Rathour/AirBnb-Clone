package com.adityarathour.AirbnbApp.Service;

import com.adityarathour.AirbnbApp.Entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
