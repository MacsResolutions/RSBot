package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class GluttonousBehemoth extends BossPlugin {

	private int[] ids = Constants.GLUTTONOUS_BEHEMOTH;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Gluttonous Behemoth";
	}

	@Override
	public int loop() {
		return 0;
	}

}
