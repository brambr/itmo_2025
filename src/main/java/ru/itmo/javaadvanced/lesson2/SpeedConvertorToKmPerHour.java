package ru.itmo.javaadvanced.lesson2;

import org.springframework.stereotype.Component;

@Component
public interface SpeedConvertorToKmPerHour {
    double  run(Double speedInMeterPerSecond);
}
