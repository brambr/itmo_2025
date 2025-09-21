package ru.itmo.javaadvanced.lesson2.Impl;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.itmo.javaadvanced.lesson2.SpeedConvertorToKmPerHour;
@Component
@NoArgsConstructor
public class SpeedConvertorToKmPerHourImp implements SpeedConvertorToKmPerHour {
    @Override
    public double run(Double speedInMeterPerSecond) {
        return speedInMeterPerSecond*3.6;
    }
}
