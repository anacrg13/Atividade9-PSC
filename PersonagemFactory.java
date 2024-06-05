public class PersonagemFactory {
    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 35, "Masculino", "Temporada 3", 1200, "Kienzan", "Terra", "Cidade Central");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 40, "Masculino", "Temporada 5", 9000, "Kamehameha", 5, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 25, "Masculino", "Temporada 4", 8000, "Masenko", 3, false);
    }

    public static Namekuseijin criarDende() {
        return new Namekuseijin("Dendê", 30, "Masculino", "Temporada 2", 4000, "Cura", 7, true);
    }
}
