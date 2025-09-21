package ru.itmo.javaadvanced.lesson2;

import org.springframework.stereotype.Component;

@Component
public interface SpeedConvertorToMetersPerSecond {
    double run(Double speedInKmPerHour);
}

