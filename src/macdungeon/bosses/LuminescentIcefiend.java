package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class LuminescentIcefiend extends BossPlugin {

	private int[] ids = Constants.LUMINESCENT_ICEFIEND;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Luminescent Icefiend";
	}

	@Override
	public int loop() {
		return 0;
	}

}
