package org.itmo.lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import org.itmo.lab2.pokemons.Pyukumuku;
import org.itmo.lab2.pokemons.Misdreavus;
import org.itmo.lab2.pokemons.Mismagius;
import org.itmo.lab2.pokemons.Bellsprout;
import org.itmo.lab2.pokemons.Weepinbell;
import org.itmo.lab2.pokemons.Victreebel;

public class Simulation{
  public static void main(String[] args) {
    Battle b = new Battle();
    Pyukumuku p1 = new Pyukumuku("камушек", 10);
    Misdreavus p2 = new Misdreavus("призрак", 10);
    Mismagius p3 = new Mismagius("фантом", 10);
    Bellsprout p4 = new Bellsprout("горохострел", 10);
    Weepinbell p5 = new Weepinbell("кабачек", 10);
    Victreebel p6 = new Victreebel("капуста", 10);
    b.addAlly(p1);
    b.addAlly(p3);
    b.addAlly(p5);
    b.addFoe(p2);
    b.addFoe(p4);
    b.addFoe(p6);
    b.go();
  }
}

