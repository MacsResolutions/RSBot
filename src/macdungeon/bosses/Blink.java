package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Blink extends BossPlugin {

	private int[] ids = Constants.BLINK;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Blink";
	}

	@Override
	public int loop() {
		return 0;
	}

}
