package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Stomp extends BossPlugin {

	private int[] ids = Constants.STOMP;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Stomp";
	}

	@Override
	public int loop() {
		return 0;
	}

}
