package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class Warmonger extends BossPlugin {

	private int[] ids = Constants.WARMONGER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Kal'Ger the Warmonger";
	}

	@Override
	public int loop() {
		return 0;
	}

}
