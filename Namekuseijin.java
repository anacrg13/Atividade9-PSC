public class Namekuseijin extends PersonagemDragonBall {
    private final int quantidadeEsferas;
    private final boolean podeCurar;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public int calcularPoder() {
        return (int) (ki * (1 + (podeCurar ? 0.2 : 0)));
    }

    public String fazerDesejo(String desejo) {
        // Simulação de tradução para Namekusei (pode ser alterada conforme desejado)
        return "Desejo em Namekusei: " + desejo.replace("a", "ka").replace("e", "ne").replace("i", "ti").replace("o", "ro").replace("u", "zu");
    }

    @Override
    public String toString() {
        return super.toString() + ", Quantidade de Esferas: " + quantidadeEsferas + ", Pode Curar: " + podeCurar;
    }
}
