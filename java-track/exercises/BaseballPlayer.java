
public class BaseballPlayer {
	private String Name;
	private Integer Number;
	private String Bat;
	private Integer CompleteGames;
	private Integer Game;
	private Integer Hits;
	private Integer RBI;

	public BaseballPlayer(String Name, Integer Number, String Bats, Integer CompleteGames, Integer Game, Integer Hits,
			Integer RBI) {
		this.Name = Name;
		this.Number = Number;
		this.Bat = Bat;
		this.CompleteGames = CompleteGames;
		this.Game = Game;
		this.Hits = Hits;
		this.RBI = RBI;
	}

	public String getName() {
		return this.Name;
	}

	public Integer getNumber() {
		return this.Number;
	}

	public String getBat() {
		return this.Bat;
	}

	public Integer CompleteGames() {
		return this.CompleteGames;
	}

	public Integer getGame() {
		return this.Game;
	}

	public Integer getHits() {
		return this.Hits;
	}

	public Integer getRBI() {
		return this.RBI;
	}

	public String toString(){
		return "Name = " + this.Name +
				"Players' Number = " + this.Number +
				"Player Bat: " + this.Bat +
				"Player games Completed" + this.CompleteGames + 
				"Game this year" + this.Game + "" + this.Name + "got" + this.Hits + "Hits %"
				+ this.RBI + "RBI";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer my_player = new BaseballPlayer ("Rush", 60,"switch", 2, 4, 3, 5);
		System.out.println(my_player.getName());
		System.out.println(my_player.getNumber());
		System.out.println(my_player.getBat());
		System.out.println(my_player.CompleteGames());
		System.out.println(my_player.getGame());
		System.out.println(my_player.getHits());
		System.out.println(my_player.getRBI());
		System.out.println(my_player.toString());
	}

}
