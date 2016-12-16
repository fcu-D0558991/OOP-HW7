package fcu.iecs.oop.pokemon;

public class Phyduck extends Pokemon {

	public Phyduck(String name, PokemonType type, int cp) {
		super(name, type, cp);
	}

	@Override
	public void attack() {
		System.out.println("Aqua Tall...");

	}

}
