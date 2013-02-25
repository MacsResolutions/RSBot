package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class BulwarkBeast extends BossPlugin {

	private int[] ids = Constants.BULWARK_BEAST;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Bulwark Beast";
	}

	@Override
	public int loop() {
		return 0;
	}

}
