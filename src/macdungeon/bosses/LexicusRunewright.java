package macdungeon.bosses;

import macdungeon.commom.BossPlugin;
import macdungeon.misc.Constants;

public class LexicusRunewright extends BossPlugin {

	private int[] ids = Constants.LEXICUS_RUNEWRIGHT;
	
	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Lexicus Runewright";
	}

	@Override
	public int loop() {
		return 0;
	}

}
