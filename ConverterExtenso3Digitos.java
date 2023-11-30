public class ConverterExtenso3Digitos extends ConverterExtenso2Digitos {
    private int numero;
    String[] porExtenso3 = { "Cem", "Cento e ", "Duzentos e ", "Trezentos e ", "Quatrocentos e ", "Quinhentos e ", "Seiscentos e ", "Setecentos e ", "Oitocentos", "Novecentos" };

    public ConverterExtenso3Digitos(int numero) {
        super(numero);
        this.numero = numero;
    }

    public int DecimalDaExtensao(int numero) {
        return numero = numero%1000 - numero%100 - numero%10;
    }

    @Override
    public String toString() {
        if(this.numero >= 101) {
            return porExtenso3[this.DecimalDaExtensao(this.numero)/100] + super.toString();
        }
        else {
            return porExtenso3[this.numero%100];
        }
    }
}