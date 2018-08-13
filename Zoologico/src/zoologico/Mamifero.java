package zoologico;
public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override // @Override e sobrepor 
    public void emitirSom(){
        System.out.println("Som do Mamifero");
    }
   
}
