package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Psychic extends SpecialMove{
  public Psychic() {
    super(Type.PSYCHIC, 90., 100.);
  }
  @Override
  protected void applyOppEffects(Pokemon p) {
    if(Math.random() < 0.1) {      
      p.setMod(Stat.SPECIAL_ATTACK, -1);
      p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
  }
  @Override
  protected String describe() {
    return "атакует психически";
  }
}

