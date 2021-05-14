package ufc;

public class Lutador {
   
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    
    public void apresentar(){
        
        System.out.println("------------------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos" );
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + " kg's");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("------------------------------------------");
         
    }
    
    public void status(){
        
        System.out.println("------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println("------------------------------------------");
        
    }

    public void ganharLuta(){
        
        this.setVitorias(this.getVitorias() + 1);
        
    }
    
    public void perderLuta(){
        
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    
    public void empatarLuta(){
        
        this.setEmpates(this.getEmpates() + 1);
        
    }

    public Lutador(String nome, String nacionalidade, int idade, int vitorias
            , int derrotas, int empates, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            categoria = "Inválido";
        }else if(this.peso<= 70.3){
            categoria = "Leve";
        }else if(peso <= 83.9){
            categoria = "Médio";
        }else if(peso <= 120.2){
            categoria = "Pesado";
        }else{
            categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    
}
