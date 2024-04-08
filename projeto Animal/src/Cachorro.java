public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }

    public void abanarRabo(boolean b) {
        if ((b) == true) {
            System.out.println("O cachorro está abanando o rabo!");
        } else {
            System.out.println("O cachorro não está abanando o rabo!");
        }
    }
}

