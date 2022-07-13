package use;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Derivate {


    public String derivate(Double coefficient, Double exponent) {
        BiFunction<Double, Double, Double> coeficienteResult = (coef, expo) -> coef * expo;
        Function<Double, Double> exponenteResult = (expo) -> expo - 1;

        return "la derivada de: " + coefficient +"x^" + exponent +" es de: " + coeficienteResult.apply(coefficient, exponent) +"x^" + exponenteResult.apply(exponent);
    }
    //
    public String integrate(Double coefficient, Double exponent) {
        BiFunction<Double, Double, Double> coeficienteResult = (coef, expo) -> {
            if (coef / (expo + 1) == 1) {
                return 1.0;
            } else {
                return coef / (expo + 1);
            }
        } ;
        Function<Double, Double> exponenteResult = (expo) -> expo + 1;

        return "la integral de: ∫" + coefficient +"x^" + exponent +"dx es de: " + coeficienteResult.apply(coefficient, exponent) +"x^" + exponenteResult.apply(exponent) +"+ C";
    }
}
