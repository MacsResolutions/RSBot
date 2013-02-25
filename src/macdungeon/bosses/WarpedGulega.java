package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class WarpedGulega extends BossPlugin {

	private int[] ids = Constants.WARPED_GULEGA;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Warped Gulega";
	}

	@Override
	public int loop() {
		return 0;
	}

}
