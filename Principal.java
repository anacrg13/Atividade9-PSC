public class Principal {
    public static void main(String[] args) {
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();

        // Evoluindo Goku para Super Sayajin 5
        System.out.println(goku.transformar(5));

        // Tentando evoluir Gohan para Super Sayajin 5
        String transformacaoGohan = gohan.transformar(5);
        if (transformacaoGohan.contains("Não foi possível")) {
            transformacaoGohan = gohan.transformar(3);
        }
        System.out.println(transformacaoGohan);

        // Fazendo um desejo com Dendê
        System.out.println(dende.fazerDesejo("Quero ser o mais forte do universo"));
    }
}
