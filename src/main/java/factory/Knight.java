package factory;

import factory.Character;
import genarate.RandomNumber;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Knight extends Character {
    protected int hp() {
        return RandomNumber.genarate(2, 12);
    }

    protected int power() {
        return RandomNumber.genarate(2, 12);
    }

    public void kick(Character c) {
        c.setHp(c.hp-RandomNumber.genarate(0, hp));
        System.out.println(c.getClass().getSimpleName()+" was kicked by Knight");
    }
}
