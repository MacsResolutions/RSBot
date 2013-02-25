package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class HobgoblinGeo extends BossPlugin {

	private int[] ids = Constants.HOBGOBLIN_GEO;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Hobgoblin Heomancer";
	}

	@Override
	public int loop() {
		return 0;
	}

}
