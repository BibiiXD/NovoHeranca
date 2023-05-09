public class Principal {
    public static void main(String[] args){
        Ingresso valor = new Ingresso(50.00f);
        IngressoVIP valorAdicional = new IngressoVIP(valor.getValor(), 55f);

        System.out.println(valor.toString());
        System.out.println(valorAdicional.toString());
    }
}
