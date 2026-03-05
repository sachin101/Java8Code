package org.example;

import java.util.Arrays;
import java.util.Objects;

//Java streams remove spaces and null handle case program.
public class RemoveEmptyStrings {
    public static void main(String []args)
    {
        String[] input={"Java", " ",null,"Steams","","Kolli"};
        String[] arrys =Arrays.stream(input)
                //.filter(s -> !s.isEmpty())  //is empty use
                .filter(Objects::nonNull) //in case coming null in string then handle.
                .filter(s -> !s.isBlank()) //is blank use in case more space coming

                .toArray(String[]::new);
        System.out.println(Arrays.toString(arrys));
    }
}
