package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.PoisonPowder;
import org.itmo.lab2.pokemons.Bellsprout;

public class Weepinbell extends Bellsprout{
  public Weepinbell() {
    super();
    double hp = 65;
    double att = 90;
    double def = 50;
    double spAtt = 85;
    double spDef = 45;
    double speed = 55;
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.POISON);
    addMove(new PoisonPowder());
  }

  public Weepinbell(java.lang.String name, int level) {
    super(name, level);
    double hp = calcStat(65, 334, level);
    double att = calcStat(90, 306, level);
    double def = calcStat(50, 218, level);
    double spAtt = calcStat(85, 295, level);
    double spDef = calcStat(45, 207, level);
    double speed = calcStat(55, 229, level);
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.POISON);
    addMove(new PoisonPowder());
  }
}

