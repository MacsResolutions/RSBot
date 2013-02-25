package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class RuneboundBehemoth extends BossPlugin {

	private int[] ids = Constants.RUNEBOUND_BEHEMOTH;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Runebound Behemoth";
	}

	@Override
	public int loop() {
		return 0;
	}

}
