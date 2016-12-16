package fcu.iecs.oop.pokemon;
public abstract class Pokemon {
	public Pokemon(String name, PokemonType type, int cp) {
		super();
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	private String name;
	private PokemonType type;
	private int cp;
	public String getName() {
		return name;
	}
	public PokemonType getType() {
		return type;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public abstract void attack();
	
	
}
