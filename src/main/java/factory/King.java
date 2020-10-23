package factory;

import factory.Character;
import genarate.RandomNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
public class King extends Character {
    protected int hp() {
        return RandomNumber.genarate(5, 15);
    }

    protected int power() {
        return RandomNumber.genarate(5, 15);
    }

    public void kick(Character c) {
        c.setHp(c.hp-RandomNumber.genarate(0, hp));
        System.out.println(c.getClass().getSimpleName()+" was kicked by King");

    }
}
