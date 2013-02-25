package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class ShadowForger extends BossPlugin {

	private int[] ids = Constants.SHADOW_FORGER;
			
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Shadow-forger Ihlakhizan";
	}

	@Override
	public int loop() {
		return 0;
	}

}
