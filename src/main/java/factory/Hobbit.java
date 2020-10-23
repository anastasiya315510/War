package factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hobbit extends Character{


    @Override
    protected int hp() {
        return 3;
    }

    @Override
    protected int power() {
        return 0;
    }

    @Override
    public void kick(Character c) {
    toCry();
        System.out.println(c.getClass().getSimpleName()+"  killed Hobbit");
    }

    private void toCry() {
        System.out.println("I am crying");


    }
}
