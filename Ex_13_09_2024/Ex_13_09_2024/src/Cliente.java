import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Endereco> enderecos;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.enderecos = new ArrayList<>();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void incluirEndereco() {
        enderecos.add(Endereco.retornarEndereco());
    }

    public Endereco get_endereco() {
        for (Endereco endereco : enderecos) {
            if (endereco.endereco_atual == true) {
                return endereco;
            }
        }
        return null;
    }

    @Override

    public String toString() {
        return nome + ", " + cpf + ", " + telefone + ", Endereço: " + get_endereco();
    }
}


