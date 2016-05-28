package facing.interfaces;


public class Mammal implements Animal{

    @Override
    public void eat(String food) {
        System.out.print(food);
    }

    @Override
    public void talk(String sound) {
        System.out.print(sound);
    }

    public static void main(String[]args){
        Mammal m = new Mammal();
        m.eat("grass");
        m.talk("\nMoooooo");
    }
}
