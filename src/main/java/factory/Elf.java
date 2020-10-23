package factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor

public class Elf extends Character {
    protected int hp() {
        return 10;
    }

    protected int power() {
        return 10;
    }

    public void kick(Character c) {
     if(c.getPower()<this.power){
         c.hp = 0;
     }else {
         c.setHp(hp-1);
         this.hp=0;
         System.out.println(c.getClass().getSimpleName()+" was killed Elf");
     }
    }
}
