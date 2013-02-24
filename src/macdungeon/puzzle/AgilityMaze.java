package macdungeon.puzzle;

import macdungeon.commom.PuzzlePlugin;

public class AgilityMaze extends PuzzlePlugin {

	@Override
	public String getStatus() {
		return "Solving: Agility Maze";
	}

	@Override
	public String getAuthor() {
		return "Mac_Daddy";
	}

	@Override
	public String getName() {
		return "Agility Maze";
	}

	@Override
	public int loop() {
		return 0;
	}

}
