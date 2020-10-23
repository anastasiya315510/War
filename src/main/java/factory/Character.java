package factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Character {
    int power;
    int hp;

    public Character() {
        power = power();
        hp = hp();
    }

    protected abstract int hp();

    protected abstract int power();

    public abstract void kick(Character c);
    public boolean isAlive(){
        return hp>0;
    }

}
