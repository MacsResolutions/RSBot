package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Necrolord extends BossPlugin {

	private int[] ids = Constants.NECROLORD;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Necrolord";
	}

	@Override
	public int loop() {
		return 0;
	}

}
