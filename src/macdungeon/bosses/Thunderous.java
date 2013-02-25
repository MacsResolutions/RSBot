package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Thunderous extends BossPlugin {

	private int[] ids = Constants.THUNDEROUS;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Yk'Lagor the Thunderous";
	}

	@Override
	public int loop() {
		return 0;
	}

}
