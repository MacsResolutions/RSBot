package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Riftsplitter extends BossPlugin {

	private int[] ids = Constants.RIFTSPLITTER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Har'Lakk the Riftsplitter";
	}

	@Override
	public int loop() {
		return 0;
	}

}
