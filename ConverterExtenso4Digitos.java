public class ConverterExtenso4Digitos extends ConverterExtenso3Digitos {
    private int numero;

    public ConverterExtenso4Digitos(int numero) {
        super(numero);
        this.numero = numero;
    }

    public int ExtensaoDeMilhar(int numero) {
        return numero = numero%10000 - numero%1000 - numero%100 - numero%10;
    }

    @Override
    public String toString() {
        return porExtenso[this.DecimalDaExtensao(this.numero)%10] + " Mil e " + super.toString();
    }
}