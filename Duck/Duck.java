import Defense.*;
import Fly.*;
import Offense.*;
import Sound.*;

public class Duck {
   private FlyBehaviour fly;
   private SoundBehaviour sound;
   private OffenseBehaviour offense;
   private DefenseBehaviour defense;

   public Duck(FlyBehaviour fly, SoundBehaviour sound, OffenseBehaviour offense, DefenseBehaviour defense){
       this.fly=fly;
       this.sound=sound;
       this.offense=offense;
       this.defense=defense;

   }

    public void setFly(FlyBehaviour fly) {
        this.fly = fly;
    }

    public void setSound(SoundBehaviour sound) {
        this.sound = sound;
    }

    public void setOffense(OffenseBehaviour offense){ this.offense = offense;}

    public void setDefense(DefenseBehaviour defense) { this.defense = defense; }

   public void offense(){
       offense.offense();
   }
   public void defense(){
       defense.defense();
   }

    public void fly(){
       fly.fly();  //public void fly yang tipe datanya si interfacenya(bisa pake nama interfacenya ato ndak sama aja)
    }

    public void sound()
    {
       sound.sound();
    }
}