public class ConverterExtenso1Digito extends ConverterExtenso {
    private int numero;

    public ConverterExtenso1Digito(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return porExtenso[this.numero%10];
    }
}