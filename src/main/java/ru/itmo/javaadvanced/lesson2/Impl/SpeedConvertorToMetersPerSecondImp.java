package ru.itmo.javaadvanced.lesson2.Impl;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.itmo.javaadvanced.lesson2.SpeedConvertorToMetersPerSecond;

@Component
@NoArgsConstructor
public class SpeedConvertorToMetersPerSecondImp implements SpeedConvertorToMetersPerSecond {
    public double  run(Double speedInKmPerHour) {
        return speedInKmPerHour/3.6;
    }

}
