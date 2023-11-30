public class ConverterExtenso4Digitos extends ConverterExtenso3Digitos {
    private int numero;

    public ConverterExtenso4Digitos(int numero) {
        super(numero);
        this.numero = numero;
    }

    public int ExtensaoDeMilhar(int numero) {
        return numero = numero%10000 - numero%1000;
    }

    @Override
    public String toString() {
        return porExtenso[this.ExtensaoDeMilhar(this.numero)/1000] + " Mil e " + super.toString();
    }
}
