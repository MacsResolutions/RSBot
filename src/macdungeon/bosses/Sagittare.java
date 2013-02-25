package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Sagittare extends BossPlugin {

	private int[] ids = Constants.SAGITTARE;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Night-gazer Khighorahk";
	}

	@Override
	public int loop() {
		return 0;
	}

}
