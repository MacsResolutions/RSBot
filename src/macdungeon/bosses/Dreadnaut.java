package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Dreadnaut extends BossPlugin {

	private int[] ids = Constants.DREADNAUT;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Dreadnaut";
	}

	@Override
	public int loop() {
		return 0;
	}

}
