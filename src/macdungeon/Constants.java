package macdungeon;

import java.util.HashMap;

import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

public class Constants {
	//Misc
	public static int DUNGEON_ENTRANCE = 48496;
	public static int END_STAIRS = 50552;
	public static int RING_OF_KINSHIP = 15707;
	public static int FREMENNIK_BANKER = 9710;
	public static int COINS = 18201;
	public static int WALL = 0x200000;
	public static int[] GROUP_GATESTONE = {18829, 20208};
	public static int[] PERSONAL_GATESTONE = {17489, 20863};
	public static int[] PORTAL = {53124, 53125, 53126};
	public static int[] FINISHED_LADDERS = {49696, 49698, 49700};
	public static int[] EXIT_LADDERS = {50604, 51156, 51704};
	
	//Keys
	public static int[] ORANGE_KEYS = {18202, 18204, 18206, 18208, 18210, 18212, 18214, 18216};
    public static int[] SILVER_KEYS = {18218, 18220, 18222, 18224, 18226, 18228, 18230, 18232};
    public static int[] YELLOW_KEYS = {18234, 18236, 18238, 18240, 18242, 18244, 18246, 18248};
    public static int[] GREEN_KEYS = {18250, 18252, 18254, 18256, 18258, 18260, 18262, 18264};
    public static int[] BLUE_KEYS = {18266, 18268, 18270, 18272, 18274, 18276, 18278, 18280};
    public static int[] PURPLE_KEYS = {18282, 18284, 18286, 18288, 18290, 18292, 18294, 18296};
    public static int[] CRIMSON_KEYS = {18298, 18300, 18302, 18304, 18306, 18308, 18310, 18312};
    public static int[] GOLD_KEYS = {18314, 18316, 18318, 18320, 18322, 18324, 18326, 18328};
	public static int[][] KEYS = {ORANGE_KEYS, SILVER_KEYS, YELLOW_KEYS, GREEN_KEYS, BLUE_KEYS, 
									PURPLE_KEYS, CRIMSON_KEYS, GOLD_KEYS};
	
	//Doors
	public static int[] GUARDIAN_DOORS = {50346, 50347, 50348};
	public static int[] STANDARD_DOORS = {49306, 49335, 49336, 49337, 49338, 49375, 49625, 50342, 
									50343, 50344, 50311, 50275};
	public static int[] ORANGE_DOORS = {50208, 50209, 50210, 50211, 50212, 50213, 50214, 50215};
	public static int[] SILVER_DOORS = {50216, 50217, 50218, 50219, 50220, 50221, 50222, 50223};
	public static int[] YELLOW_DOORS = {50224, 50225, 50226, 50227, 50228, 50229, 50230, 50231};
	public static int[] GREEN_DOORS = {50232, 50233, 50234, 50235, 50236, 50237, 50238, 50239};
	public static int[] BLUE_DOORS = {50240, 50241, 50242, 50243, 50244, 50245, 50246, 50247};
	public static int[] PURPLE_DOORS = {50248, 50249, 50250, 50251, 50252, 50253, 50254, 50255};
	public static int[] CRIMSON_DOORS = {50256, 50257, 50258, 50259, 50260, 50261, 50262, 50263};
	public static int[] GOLD_DOORS = {50264, 50265, 50266, 50267, 50268, 50269, 50270, 50271};
	public static int[] BOSS_DOORS = {50350, 50351, 50352, 53950};
	public static int[] FLAMMABLE_DEBRIS = {50314, 50315, 50316};
	public static int[] BROKEN_PULLEY_DOOR = {50299, 50300, 50301};
	public static int[] BROKEN_KEY_DOOR = {50308, 50309, 50310};
	public static int[] DARK_SPIRIT = {50332, 50333, 50334};
	public static int[] WOODEN_BARRICADE = {50317, 50318, 50319};
	public static int[] RUINED_DOOR = {50278, 50279, 50280};
	public static int[] PILE_OF_ROCKS = {50305, 50306, 50307};
	public static int[] MAGICAL_BARRIER = {50329, 50330, 50331};
	public static int[] BARRED_DOOR = {50272, 50273, 50274};
	public static int[] LOCKED_DOOR = {50287, 50288, 50289};
	public static int[] PADLOCKED_DOOR = {50293, 50294, 50295};
	public static int[] RAMOKEE_EXILE = {50326, 50327, 50328};
	public static int[] VINE_COVERED_DOOR = {50323, 50324, 50325};
	public static int[] COLLAPSING_DOORFRAME = {50281, 50282, 50283};
	public static int[][] BASIC_DOORS = {GUARDIAN_DOORS, STANDARD_DOORS};
	public static int[][] KEY_DOORS = {ORANGE_DOORS, SILVER_DOORS, YELLOW_DOORS, GREEN_DOORS, BLUE_DOORS, PURPLE_DOORS,
									CRIMSON_DOORS, GOLD_DOORS};
	public static int[][] SKILL_DOORS = {FLAMMABLE_DEBRIS, BROKEN_PULLEY_DOOR, BROKEN_KEY_DOOR, DARK_SPIRIT,
									WOODEN_BARRICADE, RUINED_DOOR, PILE_OF_ROCKS, MAGICAL_BARRIER,
									BARRED_DOOR, LOCKED_DOOR, PADLOCKED_DOOR, RAMOKEE_EXILE,
									VINE_COVERED_DOOR, COLLAPSING_DOORFRAME};
	public static int[][] DOORS = {GUARDIAN_DOORS, STANDARD_DOORS, ORANGE_DOORS, SILVER_DOORS, YELLOW_DOORS, GREEN_DOORS, 
									BLUE_DOORS, PURPLE_DOORS,CRIMSON_DOORS, GOLD_DOORS, FLAMMABLE_DEBRIS, 
									BROKEN_PULLEY_DOOR, BROKEN_KEY_DOOR, DARK_SPIRIT, WOODEN_BARRICADE, 
									RUINED_DOOR, PILE_OF_ROCKS, MAGICAL_BARRIER, BARRED_DOOR, LOCKED_DOOR, 
									PADLOCKED_DOOR, RAMOKEE_EXILE, VINE_COVERED_DOOR, COLLAPSING_DOORFRAME};
	
	/*
	 * Food variables
	 * Used multidimensional arrays, array[0] is the raw ids, array[1] is cooked,
	 * array[2] is burnt
	 */
	public static int[][] HEIM_CRAB = {
									{17797, 17798},
									{18159, 18160, 20842, 20861},
									{18179, 18180}};
	public static int[][] RED_EYE = {
									{17799, 17800},
									{18161, 18162},
									{18181, 18182}};
	public static int[][] DUSK_EEL = {
									{17801, 17802},
									{18163, 18164, 20862},
									{18183, 18184}};
	public static int[][] FLATFISH = {
									{17803, 17804},
									{18165, 18166, 20843},
									{18185, 18186}};
	public static int[][] SHORT_FIN = {
									{17805, 17806},
									{18167, 18168},
									{18187, 18188}};
	public static int[][] WEB_SNIPPER = {
									{17807, 17808},
									{18169, 18170},
									{18189, 18190}};
	public static int[][] BOULDABASS = {
									{17809, 17810},
									{18171, 18172},
									{18191, 18192}};
	public static int[][] SALVE_EEL = {
									{17811, 17812},
									{18173, 18174},
									{18193, 18194}};
	public static int[][] BLUE_CRAB = {
									{17813, 17814},
									{18175, 18176},
									{18195, 18196}};
	public static int[][] CAVE_MORAY = {
									{17815, 17816},
									{18177, 18178},
									{18197, 18198}};
	public static int[][] RAW_FOOD = {HEIM_CRAB[0], RED_EYE[0], DUSK_EEL[0], FLATFISH[0], SHORT_FIN[0],
									WEB_SNIPPER[0], BOULDABASS[0], SALVE_EEL[0], BLUE_CRAB[0], CAVE_MORAY[0]};
	public static int[][] COOKED_FOOD = {HEIM_CRAB[1], RED_EYE[1], DUSK_EEL[1], FLATFISH[1], SHORT_FIN[1],
									WEB_SNIPPER[1], BOULDABASS[1], SALVE_EEL[1], BLUE_CRAB[1], CAVE_MORAY[1]};
	public static int[][] BURNT_FOOD = {HEIM_CRAB[2], RED_EYE[2], DUSK_EEL[2], FLATFISH[2], SHORT_FIN[2],
									WEB_SNIPPER[2], BOULDABASS[2], SALVE_EEL[2], BLUE_CRAB[2], CAVE_MORAY[2]};
	public static int[][] NOOB_FOOD = {HEIM_CRAB[1], RED_EYE[1]};
	public static int[][] GOOD_FOOD = {DUSK_EEL[1], FLATFISH[1], SHORT_FIN[1], WEB_SNIPPER[1], BOULDABASS[1], 
									SALVE_EEL[1], BLUE_CRAB[1], CAVE_MORAY[1]};
	
	//Puzzle
	
	
	//NPCs
	
	/*
	 *	Interfaces to be used to form a party, select floor and complexity,
	 *	leave party, and reset prestige
	 *	Going to have to go in individual class that uses it
	 */
	/*
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
	*/
}
