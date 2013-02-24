package macdungeon;

import java.util.HashMap;

import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

public class Constants {
	public static int DUNGEON_ENTRANCE = 48496;
	public static int RING_OF_KINSHIP = 15707;
	
	/*
	 *	Interfaces to be used to form a party, select floor and complexity,
	 *	leave party, and reset prestige
	 */
	public static Widget MUST_BE_IN_PARTY = new Widget(1186);
	public static WidgetChild MUST_BE_IN_PARTY_YES = new WidgetChild(MUST_BE_IN_PARTY, 11);
	public static WidgetChild MUST_BE_IN_PARTY_NO = new WidgetChild(MUST_BE_IN_PARTY, 13);
	
	public static Widget PARTY_INTERFACE = new Widget(939);
	public static WidgetChild FORM_PARTY = new WidgetChild(PARTY_INTERFACE, 45);
	public static WidgetChild LEAVE_PARTY = new WidgetChild(PARTY_INTERFACE, 33);
	public static WidgetChild INVITE_PLAYER = new WidgetChild(PARTY_INTERFACE, 43);
	public static WidgetChild CHANGE_FLOOR = new WidgetChild(PARTY_INTERFACE, 110);
	public static WidgetChild CHANGE_COMPLEXITY = new WidgetChild(PARTY_INTERFACE, 104);
	public static WidgetChild RESET_PRESTIGE = new WidgetChild(PARTY_INTERFACE, 87);
	public static int CURRENT_PROGESS = Integer.parseInt(new WidgetChild(PARTY_INTERFACE, 83).getText());
	public static int PREVIOUS_PROGRESS = Integer.parseInt(new WidgetChild(PARTY_INTERFACE, 84).getText());
	
	public static Widget SELECT_FLOOR_INTERFACE = new Widget(947);
	public static HashMap<Integer, WidgetChild> FLOOR_MAP = new HashMap<Integer, WidgetChild>();
	public static void loadFloorMap() {
		for (int i = 1; i <= 60; i++)
			FLOOR_MAP.put(i, new WidgetChild(SELECT_FLOOR_INTERFACE, i + 607));
	}
	public static WidgetChild CONFIRM_FLOOR = new WidgetChild(SELECT_FLOOR_INTERFACE, 766);
	
	public static Widget COMPLEXITY_INTERFACE = new Widget(938);
	public static WidgetChild CONFIRM_COMPLEXITY = new WidgetChild(COMPLEXITY_INTERFACE, 39);
	public static WidgetChild[] COMPLEXITIES = {
									new WidgetChild(COMPLEXITY_INTERFACE, 60), 
									new WidgetChild(COMPLEXITY_INTERFACE, 65), 
									new WidgetChild(COMPLEXITY_INTERFACE, 70), 
									new WidgetChild(COMPLEXITY_INTERFACE, 75), 
									new WidgetChild(COMPLEXITY_INTERFACE, 80),
									new WidgetChild(COMPLEXITY_INTERFACE, 85)};
	
}
