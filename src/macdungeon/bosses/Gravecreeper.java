package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Gravecreeper extends BossPlugin {

	private int[] ids = Constants.GRAVECREEPER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Gravecreeper";
	}

	@Override
	public int loop() {
		return 0;
	}

}
