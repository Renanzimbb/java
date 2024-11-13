public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    // public void inclui (Filme f){
    //     tempoTotal += f.getDuracaoEmMinutos();
    // }

    // public void inclui (Serie f){
    //     tempoTotal += f.getDuracaoEmMinutos();
    // }

    public void inclui(Titulo t){
        System.out.println("Adicionando duração em minutos " + t.nome());
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}