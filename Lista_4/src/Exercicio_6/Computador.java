package Exercicio_6;

public class Computador {
    private String processador;
    private int memoria_ram;
    private String armazenamento;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if (processador != null) {
            this.processador = processador;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        if (memoria_ram < 0) {
            this.memoria_ram = memoria_ram;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        if (armazenamento != null) {
            this.armazenamento = armazenamento;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

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
