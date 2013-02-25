package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class WorldGorger extends BossPlugin {

	private int[] ids = Constants.WORLD_GORGER;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "World-Gorger Shukarhazh";
	}

	@Override
	public int loop() {
		return 0;
	}

}
