import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso chefão", 1980);
        meuFilme.avalia(122);
        Filme outroFilme = new Filme("Avatar", 1700);
        outroFilme.avalia(232);
        Filme filmeDoPaulao = new Filme("Dogville", 1980);
        Serie lost = new Serie("Lost", 1880);
        lost.avalia(32);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item : lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());
        }
    }
}
