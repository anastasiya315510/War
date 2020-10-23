package factory;

import genarate.RandomNumber;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class CharacterFactory {

    List<Supplier<Character>> character =asList(Hobbit::new, Elf::new, King::new, Knight::new);

    public Character createCharacter(){

        return character.get(RandomNumber.genarate(0,character.size())).get();
    }

}
