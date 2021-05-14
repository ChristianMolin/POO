package ufc;

public class UFC {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
                
        l[0] = new Lutador("Chris", "Brasil", 22, 10, 3, 2, 1.80, 75.5);
        l[1] = new Lutador("Mico", "Russia", 32, 22, 43, 5, 1.66, 71.2);
        l[2] = new Lutador("Leão", "Italia", 25, 15, 2, 0, 1.90, 87.3);
        l[3] = new Lutador("Dourado", "Argentina", 40, 27, 50, 6, 1.71, 55.2);
        l[4] = new Lutador("Xing Ling", "China", 27, 22, 3, 1, 1.65, 61.5);
        l[5] = new Lutador("Roy", "EUA", 33, 45, 43, 3, 1.87, 140.2);
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
        l[0].status();
        l[1].status();
        
        
        
        
        
        
        /*l[0].apresentar();
        l[1].status();
        l[2].apresentar();
        l[3].status();
        l[4].apresentar();
        l[5].status();
        
        l[0].ganharLuta();
        l[1].perderLuta();
        l[2].empatarLuta();
        l[5].setPeso(110.2);
        
        l[0].status();
        l[1].status();
        l[2].status();
        l[5].status();*/
        
    }
    
}
