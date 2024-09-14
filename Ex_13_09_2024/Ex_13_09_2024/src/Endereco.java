import java.util.Scanner;

public class Endereco {
    public boolean endereco_atual;
    private String cidade;
    private String rua;
    private String bairro;
    private String logradouro;
    private int numero;

    public static Endereco retornarEndereco(){
        Endereco endereco = new Endereco();
        Scanner sc = new Scanner(System.in);

         String cidade;
         String rua;
         String bairro;
         String logradouro;
         int numero;

        System.out.println("Informe a cidade: ");
        cidade = sc.nextLine();
        System.out.println("Informe a rua: ");
        rua = sc.nextLine();
        System.out.println("Informe a bairro: ");
        bairro = sc.nextLine();
        System.out.println("Informe a logradouro: ");
        logradouro = sc.nextLine();
        System.out.println("Informe a numero: ");
        numero = sc.nextInt();


        endereco.cidade = cidade;
        endereco.rua = rua;
        endereco.bairro = bairro;
        endereco.logradouro = logradouro;
        endereco.numero = numero;

        int temp;

        System.out.println(("Esse é o seu endereõ atual? (1)Sim (2)Não"));
        temp = sc.nextInt();
        if(temp == 1){
            endereco.endereco_atual = true;
        } else{
            endereco.endereco_atual = false;
        }

        return endereco;
    }

    @Override

    public String toString() {
        return "Numero: " + numero +"Rua: " + rua + ", Bairro: " + bairro + ", Logradouro: " + logradouro + ", Cidade: " + cidade;
    }

}
