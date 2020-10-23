import factory.Character;
import factory.CharacterFactory;
import lombok.SneakyThrows;

public class GameManager {
    static CharacterFactory cf = new CharacterFactory();
    static Character c1 =  cf.createCharacter();
    static Character c2 =  cf.createCharacter();

    @SneakyThrows
    void fight(Character c1, Character c2){
        System.out.println(c1.getClass().getSimpleName() +"is fighting with "+ c2.getClass().getSimpleName());





    }

    public static void main(String[] args) {
       GameManager gm = new GameManager();
       gm.fight(c1,c2);
       while (c1.isAlive()&& c2.isAlive()){
           c1.kick(c2);
           c2.kick(c1);
       }
       if(c1.isAlive()){
           System.out.println(c2.getClass().getSimpleName()+" was died");
           System.out.println(c1.getClass().getSimpleName()+" is winner");
       }else {
           System.out.println(c1.getClass().getSimpleName()+" was died");
           System.out.println(c2.getClass().getSimpleName()+" is winner");
       }



    }
}
