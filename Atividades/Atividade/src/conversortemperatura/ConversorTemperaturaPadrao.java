package conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double fahrenheitParaCelcius(double fahrenheit) {
        double calculoConversao = (fahrenheit - 32) * 5/9;
        System.out.println(String.format("%.2fºF convertidos para ºC resulta em: %.2fºC",fahrenheit,calculoConversao));
        return calculoConversao;
    }

    @Override
    public double celciusParaFahrenheit(double celcius) {
        double calculoConVersao = (celcius * 9/5) + 32;
        System.out.println(String.format("%.2fºC convertidos para ºF resulta em: %.2fºF ",celcius,calculoConVersao));
        return calculoConVersao;
    }
}
