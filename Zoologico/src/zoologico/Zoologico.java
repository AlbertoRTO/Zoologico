package zoologico;
public class Zoologico {
    public static void main(String[] args) {
        Chachoro c = new Chachoro();
        c.reagir("Olar");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
        
    }
    
}
