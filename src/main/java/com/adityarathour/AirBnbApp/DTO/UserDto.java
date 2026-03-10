package com.adityarathour.AirbnbApp.DTO;

import com.adityarathour.AirbnbApp.Enum.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
