package com.adityarathour.AirbnbApp.Service;

import com.adityarathour.AirbnbApp.DTO.ProfileUpdateRequestDto;
import com.adityarathour.AirbnbApp.DTO.UserDto;
import com.adityarathour.AirbnbApp.Entity.User;

public interface UserService {
    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
