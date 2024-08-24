package Exercicio_6;

public class Computador {
    public String processador;
    public int memoria_ram;
    public String armazenamento;

    public Computador(String processador, int memoria_ram, String armazenamento){
        this.processador = processador;
        this.memoria_ram = memoria_ram;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        System.out.println("Ligando...");
    }

    public void desligar(){
        System.out.println("Desligando...");
    }

    @Override

   public String toString(){
        return processador + " - " + memoria_ram + " - " + armazenamento;
    }
}
