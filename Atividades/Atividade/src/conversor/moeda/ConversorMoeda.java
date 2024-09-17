package conversor.moeda;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double valDolar) {
        double valorReal = 5.51;
        return valDolar * valorReal;
    }
}
