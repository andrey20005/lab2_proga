package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.LeafTornado;
import org.itmo.lab2.pokemons.Weepinbell;

public class Victreebel extends Weepinbell{
  public Victreebel() {
    super();
    double hp = 80;
    double att = 105;
    double def = 65;
    double spAtt = 100;
    double spDef = 70;
    double speed = 70;
    setStats(hp, att, def, spAtt, spDef, speed);
    addMove(new LeafTornado());
  }

  public Victreebel(java.lang.String name, int level) {
    super(name, level);
    double hp = calcStat(80, 364, level);
    double att = calcStat(105, 339, level);
    double def = calcStat(65, 251, level);
    double spAtt = calcStat(100, 328, level);
    double spDef = calcStat(70, 262, level);
    double speed = calcStat(70, 262, level);
    setStats(hp, att, def, spAtt, spDef, speed);
    addMove(new LeafTornado());
  }
}

