package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Rammernaut extends BossPlugin {

	private int[] ids = Constants.RAMMERNAUT;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Rammernaut";
	}

	@Override
	public int loop() {
		return 0;
	}

}
