package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class IcyBones extends BossPlugin {

	private int[] ids = Constants.ICY_BONES;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Icy Bones";
	}

	@Override
	public int loop() {
		return 0;
	}

}
