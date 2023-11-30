public class ConverterExtenso2Digitos extends ConverterExtenso1Digito {
    private int numero;
    String[] porExtenso2 = { "Dez", "Onze", "Doze", "Treze", "Catorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove" };
    String[] porExtenso20 = { "Vinte e ", "Trinta e ", "Quarenta e ", "Ciquenta e ", "Sessenta e ", "Setenta e ", "Oitenta e ", "Noventa e ", "q", "w", "e" };

    ConverterExtenso2Digitos(int numero) {
        super(numero);
        this.numero = numero;
    }

    public int DecimalDaExtensao(int numero) {
        return numero = numero%100 - numero%10;
    }

    @Override
    public String toString() {
        if(this.numero >= 20) {
            return porExtenso20[this.DecimalDaExtensao(this.numero)/10 - 2] + super.toString();
        }
        else {
            return porExtenso2[this.numero%10];
        }
    }
}
