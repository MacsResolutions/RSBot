package macdungeon.commom;

public abstract class BossPlugin extends Plugin {

	@Override
	public String getStatus() {
		return "Killing: " + getName();
	}
}
