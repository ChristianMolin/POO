package aula09on;


public class PortaCarro {
    private int posicao;
    private boolean aberto;
    
    public PortaCarro(){
        this.posicao = 0;
        this.aberto = false;
    }
     public PortaCarro(int posicao){
        this.setPosicao(posicao);
    }
      public int getPosicao(){ //get para retornar a posição
       return (this.posicao); 
    }
       public void setPosicao(int posicao){ //set para alterar a posição, "setar"
        if(posicao == 0 || posicao == 1){
            this.posicao = posicao;
            
            if(this.posicao == 1){
                this.aberto = true;
            }else{
                this.aberto = false;
            }
        }else{
            System.out.println("Posição da porta deve ser entre 0 e 1");
        }
    }
       public void abrirPorta(){
        if(this.posicao == 1){
            this.aberto = true;
            System.out.println("A porta já está aberta!");
        }else{
            this.posicao = 1;
            this.aberto = true;
            System.out.println("A porta foi aberta!");
        }
    }
        public void fecharPorta(){
        if(this.posicao == 0){
            System.out.println("A porta já está fechada!");
        }else{
            this.posicao = 0;
            this.aberto = false;
            System.out.println("A porta foi fechada!");
        }
    }
        public void statusPorta(){
        System.out.println("Porta aberta ? " + this.aberto);
    }
}


