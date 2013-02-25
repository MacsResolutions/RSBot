package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class UnholyCursebearer extends BossPlugin {

	private int[] ids = Constants.UNHOLY_CURSEBEARER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Unholy Cursebearer";
	}

	@Override
	public int loop() {
		return 0;
	}

}
