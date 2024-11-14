
public class Titulo{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome(){
        return nome;
    }     

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int minutos){
        this.duracaoEmMinutos = minutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    
    public void setAnoDeLancamento(int ano){
        this.anoDeLancamento = ano;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
       return somaDasAvaliacoes/ totalDeAvaliacoes;
    }
}