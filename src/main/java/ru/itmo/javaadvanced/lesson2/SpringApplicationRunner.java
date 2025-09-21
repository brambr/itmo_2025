package ru.itmo.javaadvanced.lesson2;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"ru.itmo.javaadvanced.lesson2"})
@SpringBootApplication
public class SpringApplicationRunner {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringApplicationRunner.class, args)) {
                SpeedConvertorToMetersPerSecond convertorSpeedToMeterPerSecond = applicationContext.getBean("speedConvertorToMetersPerSecondImp" , SpeedConvertorToMetersPerSecond.class);
                SpeedConvertorToKmPerHour convertorSpeedToKmPerHour= applicationContext.getBean("speedConvertorToKmPerHourImp",SpeedConvertorToKmPerHour.class);
                Scanner scanner=new Scanner(System.in);
                boolean exit = true;
                double currrentSpeed;
                do {
                    System.out.print("Please choose the dimension for speed:\n 1 - km per hour \n 2 - meter per minute \nor press 3 for exit.\n");
                    int dimension = scanner.nextInt(); // Read a line of text (string)
                    if (dimension == 1) {
                        System.out.println("Please enter the speed value in km per hour:");
                        currrentSpeed=scanner.nextDouble();
                        System.out.println("The speed value in meters per second is equal: "+convertorSpeedToMeterPerSecond.run(currrentSpeed));
                        exit = false;
                    }
                    else
                        if (dimension == 2) {
                            System.out.println("Please enter the speed value in meters per minute:");
                            currrentSpeed=scanner.nextDouble();
                            System.out.println("The speed value in km per hour is equal: "+convertorSpeedToKmPerHour.run(currrentSpeed));
                            exit = false;
                        }
                        else {
                            System.out.println("Please enter the right number again or pres 3 to exit");
                            if (dimension == 3) exit = false;
                        }
                } while (exit);

        }

    }
}
