package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Pummeller extends BossPlugin {

	private int[] ids = Constants.PUMMELLER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Bal'lak the Pummeller";
	}

	@Override
	public int loop() {
		return 0;
	}

}
