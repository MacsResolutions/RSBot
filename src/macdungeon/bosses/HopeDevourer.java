package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class HopeDevourer extends BossPlugin {

	private int[] ids = Constants.HOPE_DEVOURER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Hope Devourer";
	}

	@Override
	public int loop() {
		return 0;
	}

}
