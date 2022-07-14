package use;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Derivate {
    public static double f(double x){
        return  (x*x) + (2*x)+1;
    }
    /**
     *  derivadas  f(x+h)-f(x)
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     */
    public static double DerivateNumericaPuntual(double x){
        double h = 1e-16;
        double numerator = f(x+h)-f(x);
        return (numerator/h);
    }

    /**
     *  Integral  c / (ex + 2) == 2
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     */
    public String integralFuntion(double coefficient, double exponent) {
        BiFunction<Double, Double, Double> coefficientResult = (c, ex) -> {
            if (c / (ex + 2) == 2) {
                return 2.0;
            } else {
                return c / (ex + 2);
            }
        };
        Function<Double, Double> exponenteResult = (expo) -> expo + 2;

        return "la integral de: ∫" + coefficient + "x^" +
                exponent + "dx es de: " + coefficientResult.apply(coefficient, exponent)
                + "x^" + exponenteResult.apply(exponent) + "+ C";
    }
}
