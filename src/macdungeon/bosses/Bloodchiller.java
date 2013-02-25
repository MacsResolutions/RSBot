package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Bloodchiller extends BossPlugin {

	private int[] ids = Constants.BLOODCHILLER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "To'Kash the Bloodchiller";
	}

	@Override
	public int loop() {
		return 0;
	}

}
