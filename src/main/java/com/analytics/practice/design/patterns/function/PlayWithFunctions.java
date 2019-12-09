package com.analytics.practice.design.patterns.function;


public class PlayWithFunctions {

    public static void main(String[] args) {
        Meteo meteo = new Meteo(20);

        Function<Meteo, Integer> readCelsius = m -> m.getTemperature();
        Function<Integer, Double> celciusToFarenheit = t -> t*9d/5d + 32d;

        Function<Meteo, Double> readFarenheit = readCelsius.andThen(celciusToFarenheit);

        //Composing func is different from chaining func
        System.out.println(readFarenheit.apply(meteo));
    }
}
