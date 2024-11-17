package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.MysticalFire;
import org.itmo.lab2.pokemons.Misdreavus;

public class Mismagius extends Misdreavus{
  public Mismagius() {
    super();
    double hp = 60;
    double att = 60;
    double def = 60;
    double spAtt = 105;
    double spDef = 105;
    double speed = 105;
    setStats(hp, att, def, spAtt, spDef, speed);
    addMove(new MysticalFire());
  }

  public Mismagius(java.lang.String name, int level) {
    super(name, level);
    double hp = calcStat(60, 324, level);
    double att = calcStat(60, 240, level);
    double def = calcStat(60, 240, level);
    double spAtt = calcStat(105, 339, level);
    double spDef = calcStat(105, 339, level);
    double speed = calcStat(105, 339, level);
    setStats(hp, att, def, spAtt, spDef, speed);
    addMove(new MysticalFire());
  }
}

