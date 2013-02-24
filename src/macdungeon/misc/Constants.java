package macdungeon.misc;

public class Constants {
	// Misc
	public static int DUNGEON_ENTRANCE = 48496;
	public static int END_STAIRS = 50552;
	public static int RING_OF_KINSHIP = 15707;
	public static int FREMENNIK_BANKER = 9710;
	public static int COINS = 18201;
	public static int WALL = 0x200000;
	public static int[] GROUP_GATESTONE = { 18829, 20208 };
	public static int[] PERSONAL_GATESTONE = { 17489, 20863 };
	public static int[] PORTAL = { 53124, 53125, 53126 };
	public static int[] FINISHED_LADDERS = { 49696, 49698, 49700 };
	public static int[] EXIT_LADDERS = { 50604, 51156, 51704 };

	// Keys
	public static int[] ORANGE_KEYS = { 18202, 18204, 18206, 18208, 18210,
			18212, 18214, 18216 };
	public static int[] SILVER_KEYS = { 18218, 18220, 18222, 18224, 18226,
			18228, 18230, 18232 };
	public static int[] YELLOW_KEYS = { 18234, 18236, 18238, 18240, 18242,
			18244, 18246, 18248 };
	public static int[] GREEN_KEYS = { 18250, 18252, 18254, 18256, 18258,
			18260, 18262, 18264 };
	public static int[] BLUE_KEYS = { 18266, 18268, 18270, 18272, 18274, 18276,
			18278, 18280 };
	public static int[] PURPLE_KEYS = { 18282, 18284, 18286, 18288, 18290,
			18292, 18294, 18296 };
	public static int[] CRIMSON_KEYS = { 18298, 18300, 18302, 18304, 18306,
			18308, 18310, 18312 };
	public static int[] GOLD_KEYS = { 18314, 18316, 18318, 18320, 18322, 18324,
			18326, 18328 };
	public static int[][] KEYS = { ORANGE_KEYS, SILVER_KEYS, YELLOW_KEYS,
			GREEN_KEYS, BLUE_KEYS, PURPLE_KEYS, CRIMSON_KEYS, GOLD_KEYS };

	// Doors
	public static int[] GUARDIAN_DOORS = { 50346, 50347, 50348 };
	public static int[] STANDARD_DOORS = { 49306, 49335, 49336, 49337, 49338,
			49375, 49625, 50342, 50343, 50344, 50311, 50275 };
	public static int[] ORANGE_DOORS = { 50208, 50209, 50210, 50211, 50212,
			50213, 50214, 50215 };
	public static int[] SILVER_DOORS = { 50216, 50217, 50218, 50219, 50220,
			50221, 50222, 50223 };
	public static int[] YELLOW_DOORS = { 50224, 50225, 50226, 50227, 50228,
			50229, 50230, 50231 };
	public static int[] GREEN_DOORS = { 50232, 50233, 50234, 50235, 50236,
			50237, 50238, 50239 };
	public static int[] BLUE_DOORS = { 50240, 50241, 50242, 50243, 50244,
			50245, 50246, 50247 };
	public static int[] PURPLE_DOORS = { 50248, 50249, 50250, 50251, 50252,
			50253, 50254, 50255 };
	public static int[] CRIMSON_DOORS = { 50256, 50257, 50258, 50259, 50260,
			50261, 50262, 50263 };
	public static int[] GOLD_DOORS = { 50264, 50265, 50266, 50267, 50268,
			50269, 50270, 50271 };
	public static int[] BOSS_DOORS = { 50350, 50351, 50352, 53950 };
	public static int[] FLAMMABLE_DEBRIS = { 50314, 50315, 50316 };
	public static int[] BROKEN_PULLEY_DOOR = { 50299, 50300, 50301 };
	public static int[] BROKEN_KEY_DOOR = { 50308, 50309, 50310 };
	public static int[] DARK_SPIRIT = { 50332, 50333, 50334 };
	public static int[] WOODEN_BARRICADE = { 50317, 50318, 50319 };
	public static int[] RUINED_DOOR = { 50278, 50279, 50280 };
	public static int[] PILE_OF_ROCKS = { 50305, 50306, 50307 };
	public static int[] MAGICAL_BARRIER = { 50329, 50330, 50331 };
	public static int[] BARRED_DOOR = { 50272, 50273, 50274 };
	public static int[] LOCKED_DOOR = { 50287, 50288, 50289 };
	public static int[] PADLOCKED_DOOR = { 50293, 50294, 50295 };
	public static int[] RAMOKEE_EXILE = { 50326, 50327, 50328 };
	public static int[] VINE_COVERED_DOOR = { 50323, 50324, 50325 };
	public static int[] COLLAPSING_DOORFRAME = { 50281, 50282, 50283 };
	public static int[][] BASIC_DOORS = { GUARDIAN_DOORS, STANDARD_DOORS };
	public static int[][] KEY_DOORS = { ORANGE_DOORS, SILVER_DOORS,
			YELLOW_DOORS, GREEN_DOORS, BLUE_DOORS, PURPLE_DOORS, CRIMSON_DOORS,
			GOLD_DOORS };
	public static int[][] SKILL_DOORS = { FLAMMABLE_DEBRIS, BROKEN_PULLEY_DOOR,
			BROKEN_KEY_DOOR, DARK_SPIRIT, WOODEN_BARRICADE, RUINED_DOOR,
			PILE_OF_ROCKS, MAGICAL_BARRIER, BARRED_DOOR, LOCKED_DOOR,
			PADLOCKED_DOOR, RAMOKEE_EXILE, VINE_COVERED_DOOR,
			COLLAPSING_DOORFRAME };
	public static int[][] DOORS = { GUARDIAN_DOORS, STANDARD_DOORS,
			ORANGE_DOORS, SILVER_DOORS, YELLOW_DOORS, GREEN_DOORS, BLUE_DOORS,
			PURPLE_DOORS, CRIMSON_DOORS, GOLD_DOORS, FLAMMABLE_DEBRIS,
			BROKEN_PULLEY_DOOR, BROKEN_KEY_DOOR, DARK_SPIRIT, WOODEN_BARRICADE,
			RUINED_DOOR, PILE_OF_ROCKS, MAGICAL_BARRIER, BARRED_DOOR,
			LOCKED_DOOR, PADLOCKED_DOOR, RAMOKEE_EXILE, VINE_COVERED_DOOR,
			COLLAPSING_DOORFRAME };

	/*
	 * Food variables Used multidimensional arrays, array[0] is the raw ids,
	 * array[1] is cooked, array[2] is burnt
	 */
	public static int[][] HEIM_CRAB = { { 17797, 17798 },
			{ 18159, 18160, 20842, 20861 }, { 18179, 18180 } };
	public static int[][] RED_EYE = { { 17799, 17800 }, { 18161, 18162 },
			{ 18181, 18182 } };
	public static int[][] DUSK_EEL = { { 17801, 17802 },
			{ 18163, 18164, 20862 }, { 18183, 18184 } };
	public static int[][] FLATFISH = { { 17803, 17804 },
			{ 18165, 18166, 20843 }, { 18185, 18186 } };
	public static int[][] SHORT_FIN = { { 17805, 17806 }, { 18167, 18168 },
			{ 18187, 18188 } };
	public static int[][] WEB_SNIPPER = { { 17807, 17808 }, { 18169, 18170 },
			{ 18189, 18190 } };
	public static int[][] BOULDABASS = { { 17809, 17810 }, { 18171, 18172 },
			{ 18191, 18192 } };
	public static int[][] SALVE_EEL = { { 17811, 17812 }, { 18173, 18174 },
			{ 18193, 18194 } };
	public static int[][] BLUE_CRAB = { { 17813, 17814 }, { 18175, 18176 },
			{ 18195, 18196 } };
	public static int[][] CAVE_MORAY = { { 17815, 17816 }, { 18177, 18178 },
			{ 18197, 18198 } };
	public static int[][] RAW_FOOD = { HEIM_CRAB[0], RED_EYE[0], DUSK_EEL[0],
			FLATFISH[0], SHORT_FIN[0], WEB_SNIPPER[0], BOULDABASS[0],
			SALVE_EEL[0], BLUE_CRAB[0], CAVE_MORAY[0] };
	public static int[][] COOKED_FOOD = { HEIM_CRAB[1], RED_EYE[1],
			DUSK_EEL[1], FLATFISH[1], SHORT_FIN[1], WEB_SNIPPER[1],
			BOULDABASS[1], SALVE_EEL[1], BLUE_CRAB[1], CAVE_MORAY[1] };
	public static int[][] BURNT_FOOD = { HEIM_CRAB[2], RED_EYE[2], DUSK_EEL[2],
			FLATFISH[2], SHORT_FIN[2], WEB_SNIPPER[2], BOULDABASS[2],
			SALVE_EEL[2], BLUE_CRAB[2], CAVE_MORAY[2] };
	public static int[][] NOOB_FOOD = { HEIM_CRAB[1], RED_EYE[1] };
	public static int[][] GOOD_FOOD = { DUSK_EEL[1], FLATFISH[1], SHORT_FIN[1],
			WEB_SNIPPER[1], BOULDABASS[1], SALVE_EEL[1], BLUE_CRAB[1],
			CAVE_MORAY[1] };

	// Puzzle
	public static int POLTERGEIST = 11245;
	public static int UNHAPPY_GHOST = 11246;
	public static int FISHING_FERRET = 11007;
	public static int HUNTER_FERRET = 11010;
	public static int[] PONDSKATER = { 12089, 12090, 12091, 12092, 12093 };
	public static int PONDSKATER_WITH_KEY = PONDSKATER[0];
	public static int MAZE_BARRIER = 49341;
	public static int[] SUSPICIOUS_GROOVES_ROW_1 = { 49390, 49392, 49394,
			49396, 49414, 49416, 49418, 49420, 49438, 49440, 49442, 49444,
			54336, 54338, 54340, 54342 };
	public static int[] SUSPICIOUS_GROOVES_ROW_2 = { 49398, 49400, 49402,
			49404, 49422, 49424, 49426, 49428, 49446, 49448, 49450, 49452,
			54344, 54346, 54348, 54350 };
	public static int[] SUSPICIOUS_GROOVES_ROW_3 = { 49406, 49408, 49410,
			49412, 49430, 49432, 49434, 49436, 49454, 49456, 49458, 49460,
			54352, 54354, 54356, 54358 };
	public static int[][] SUSPICIOUS_GROOVES = { SUSPICIOUS_GROOVES_ROW_1,
			SUSPICIOUS_GROOVES_ROW_2, SUSPICIOUS_GROOVES_ROW_3 };
	public static int[] BARCRATE_CAMP = { 49528, 49529, 49530 };
	public static int[] LOGCRATE_CAMP = { 49534, 49535, 49536 };
	public static int[] FISHCRATE_CAMP = { 49522, 49523, 49524 };
	public static int[] GHOSTS = { 10981, 10983, 10985, 10987, 10989, 10991,
			10993, 10995, 10997, 10999 };
	public static int[] FTL_STATUES = { 10966, 10967, 10968, 12114 };
	public static int[] LEVERS = { 49381, 49382, 49383, 54333 };
	public static int[] SLIDERS = { 12125, 12126, 12127, 12128, 12129, 12130,
			12131, 12132, 12133, 12134, 12135, 12136, 12137, 12138, 12139,
			12140, 12141, 12142, 12143, 12144, 12145, 12146, 12147, 12148,
			12149, 12150, 12151, 12152, 12153, 12154, 12155, 12156 };
	public static int[] COLORED_FERRETS = { 12167, 12165, 12171, 12169, 12173 };
	public static int[] ALL_UNWINCHED_BRIDGES = { 39912, 39913, 39920, 39921,
			39929, 39930, 39931 };
	public static int[] WINCHED_BRIDGES = { 39915, 39924, 39935, 54643 };
	public static int[] REPAIRED_BRIDGES = { 54190, 54191, 54192, 54193 };
	public static int[] FINISHED_STATUE_BRIDGES = { 40010, 40011, 54614 };
	public static int[] FINISHED_BRIDGES = { 54013, 54014, 54015, 54016 };
	public static int[] UNGRAPPLED_CHASMS = { 54237, 54238, 54239, 54240 };
	public static int[] GRAPPLED_CHASMS = { 54241, 54242, 54243, 54244, 54245,
			54246, 54247, 54248 };
	public static int[] ICY_PRESSURE_PADS = { 49320, 49321, 49322, 49323 };
	public static int[] SMALL_DEBRIS = { 49615, 49616, 49617, 49618 };
	public static int[] HEADING_STATUES = { 10942, 10943, 10944, 10945, 10946,
			10947, 10948, 10949, 10950, 10951, 10952, 10953, 12117, 12118,
			12119, 12120 };
	public static int[] SLIDING_STATUES = { 10954, 10955, 10956, 10957, 10958,
			10959, 10960, 10961, 10962, 10963, 10964, 10965, 12121, 12122,
			12123, 12124 };
	public static int[] THREE_STATUES = { 11036, 11037, 11038, 11039, 11040,
			11041, 11042, 11043, 11044, 12094, 12095, 12096 };
	public static int[] TEN_STATUES = { 11027, 11028, 11029, 11030, 11031,
			11032, 11033, 11034, 11035 };
	public static int[] LARGE_CRYSTALS = { 49507, 49508, 49509, 49510, 49511,
			49512, 54261 };
	public static int[] TRASH = { 49315, 49316, 49317, 49318 };
	public static int[] POWER_LODESTONES = { 49570, 49571, 49572, 54235 };
	public static int[] RECESS_FOUNTAINS = { 54502, 54544, 54621 };
	public static int[] CLOSED_SARCOPHAGUS = { 54078, 54079, 54080, 54081 };
	public static int[] UNREPAIRED_STATUE_BRIDGE = { 39991, 40002, 40003 };
	public static int[] BARREL_PIPES = { 49688, 49690, 54287 };
	public static int[] AGILITY_DOORS = { 49693 };
	public static int[] DRY_BLOOD_FOUNTAIN = { 54110, 54111, 54112, 54113 };
	public static int[] FREMMY_CRATES = { 49522, 49523, 49524, 49528, 49529,
			49530, 49534, 49535, 49536 };
	public static int[] CENTER_FLOWERS = { 35507, 35520, 35523, 35525, 35562,
			35568, 35569, 35576 };
	public static int[] BOOKCASES = { 54419, 54420, 54421, 54422 };
	public static int[] ACTIVE_PADS = { 52206, 52207, 54282 };
	public static int[] AGILITY_GROOVES = { 49665, 49666, 49667, 54311 };
	public static int[] WALL_TRAPS = { 49656, 49657, 49658, 54308 };

	// NPCs
	public static int[] GLUTTONOUS_BEHEMOTH = { 9948, 9949, 9950, 9951, 9952,
			9953, 9954, 9955, 9956, 9957, 9958, 9959, 9960, 9961, 9962, 9963,
			9964 };
	public static int[] ASTEA_FROSTWEB = { 9965, 9966, 9967, 9968, 9969, 9970,
			9971, 9972, 9973, 9974, 9975, 9976, 9977, 9978, 9979, 9980, 9981,
			9982, 9983, 9984, 9985, 9986, 9987, 9988, 9989, 9990, 9991, 9992,
			9993, 9994, 9995, 9996, 9997, 9998, 9999, 10000, 10001, 10002,
			10003, 10004, 10005, 10006, 10007, 10008, 10009, 10010, 10011,
			10012, 10013, 10014, 10015, 10016, 10017, 10018, 10019, 10020,
			10021 };
	public static int[] ICY_BONES = { 10040, 10041, 10042, 10043, 10044, 10045,
			10046, 10047, 10048, 10049, 10050, 10051, 10052, 10053, 10054,
			10055, 10056, 10057 };
	public static int[] LUMINESCENT_ICEFIEND = { 9912, 9913, 9914, 9915, 9916,
			9917, 9918, 9919, 9920, 9921, 9922, 9923, 9924, 9925, 9926, 9927,
			9928 };
	public static int[] PLANE_FREEZER = { 9929, 9930, 9931, 9932, 9933, 9934,
			9935, 9936, 9937, 9938, 9939, 9940, 9941, 9942, 9943, 9944, 9945,
			9946, 9947 };
	public static int[] BLOODCHILLER = { 10024, 10025, 10026, 10027, 10028,
			10029, 10030, 10031, 10032, 10033, 10034, 10035, 10036, 10037,
			10038, 10039, 12843 };
	// TODO: get skeletal horde ids
	public static int[] SKELETAL_HORDE = {};
	public static int[] HOBGOBLIN_GEO = { 10059, 10060, 10061, 10062, 10063,
			10064, 10065, 10066, 10067, 10068, 10069, 10070, 10071, 10072 };
	public static int[] BULWARK_BEAST = { 10073, 10074, 10075, 10076, 10078,
			10079, 10080, 10081, 10082, 10083, 10084, 10085, 10086, 10087,
			10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096,
			10097, 10098, 10099, 10100, 10101, 10102, 10103, 10104, 10105,
			10106 };
	public static int[] UNHOLY_CURSEBEARER = { 10111, 10112, 10113, 10114,
			10115, 10116, 10117, 10118, 10119, 10120, 10121, 10122, 10123,
			10124, 10125, 10126, 10127 };
	public static int[] RAMMERNAUT = { 9767, 9768, 9769, 9770, 9771, 9772,
			9773, 9774, 9775, 9776, 9777, 9778, 9779, 9780 };
	public static int[] STOMP = { 6198, 9782, 9783, 9784, 9785, 9786, 9787,
			9788, 9789, 9790, 9791, 9792, 9793, 9794, 9795, 9796, 9797, 9798,
			9799, 9800, 9801, 9802, 9803, 9804, 9805, 9806, 9807, 9808, 9809,
			9810, 9811, 9812, 9813, 9814, 9815, 9816, 9817, 9818, 9819, 9820,
			9821, 9822, 9823, 9824, 9825, 9826, 9827, 9828, 9829, 9830, 9831,
			9832, 9833, 9834, 9835, 9836, 9837, 9838, 9839, 9840, 9841 };
	public static int[] RIFTSPLITTER = { 9898, 9899, 9900, 9901, 9902, 9903,
			9904, 9905, 9906, 9907, 9908, 9909, 9010, 9911, 12844 };
	public static int[] LEXICUS_RUNEWRIGHT = { 9842, 9843, 9844, 9845, 9846,
			9847, 9848, 9849, 9850, 9851, 9852, 9853, 9854, 9855 };
	public static int[] SAGITTARE = { 9753, 9754, 9755, 9756, 9757, 9758, 9759,
			9760, 9761, 9762, 9763, 9764, 9765, 9766 };
	public static int[] NIGHT_GAZER = { 9725, 9726, 9727, 9728, 9729, 9730,
			9731, 9732, 9733, 9734, 9735, 9736, 9737, 9738, 9739, 9740, 9741,
			9742, 9743, 9744, 9745, 9746, 9747, 9748, 9749, 9750, 9751, 9752 };
	public static int[] SHADOW_FORGER = { 10143, 10144, 10145, 10146, 10147,
			10148, 10149, 10150, 10151, 10152, 10153, 10154, 10155, 10156 };
	public static int[] PUMMELLER = { 10128, 10129, 10130, 10131, 10132, 10133,
			10134, 10135, 10136, 10137, 10138, 10139, 10140, 10141, 12845 };
	public static int[] SKELETAL_ARCHER = { 12044, 12045, 12046, 12047, 12048,
			12049, 12050, 12051, 12052, 12053, 12054, 12055, 12056, 12057,
			12058, 12059, 12060, 12061, 12062, 12063, 12064, 12065, 12066,
			12067, 12068, 12069, 12070, 12071, 12072, 12073, 12074, 12075,
			12076, 12077, 12078, 12079, 12080, 12081, 12082, 12083, 12084,
			12085, 12086, 12087, 12088 };
	public static int[] SKELETAL_SORCERER = { 11999, 12000, 12001, 12002,
			12003, 12004, 12005, 12006, 12007, 12008, 12009, 12010, 12011,
			12012, 12013, 12014, 12015, 12016, 12017, 12018, 12019, 12020,
			12021, 12022, 12023, 12024, 12025, 12026, 12027, 12028, 12029,
			12030, 12031, 12032, 12033, 12034, 12035, 12036, 12037, 12038,
			12039, 12040, 12041, 12042, 12043 };
	public static int[] SKELETAL_WARRIOR = { 11940, 11941, 11942, 11943, 11944,
			11945, 11946, 11947, 11948, 11949, 11950, 11951, 11952, 11953,
			11954, 11955, 11956, 11957, 11958, 11959, 11960, 11961, 11962,
			11963, 11964, 11965, 11966, 11967, 11968, 11969, 11970, 11971,
			11972, 11973, 11974, 11975, 11976, 11977, 11978, 11979, 11980,
			11981, 11982, 11983, 11984 };
	public static int[] RUNEBOUND_BEHEMOTH = { 11752, 11753, 11754, 11755,
			11756, 11757, 11758, 11759, 11760, 11761, 11762, 11763, 11764,
			11765, 11766, 11767, 11768, 11769, 11770, 11771, 11772, 11773,
			11774, 11775, 11776, 11777, 11778, 11779, 11780, 11781, 11782,
			11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791,
			11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800,
			11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809,
			11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818,
			11819, 11820, 11821, 11822, 11823, 11824, 11825, 11826, 11827,
			11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836,
			11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845,
			11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854,
			11855, 11856, 11857, 11858, 11859, 11860, 11861, 11862, 11863,
			11864, 11865, 11866, 11867, 11868, 11869, 11870, 11871 };
	public static int[] GRAVECREEPER = { 532, 533, 11708, 11709, 11710, 11711,
			11712, 11713, 11714, 11715, 11716, 11717, 11718, 11719, 11720 };
	public static int[] NECROLORD = { 11737, 11738, 11739, 11740, 11741, 11742,
			11743, 11744, 11745, 11746, 11747, 11748, 11749, 11750, 11751 };
	public static int[] FLESH_SPOILER_1 = { 11895, 11896, 11897, 11898, 11899,
			11900, 11901, 11902, 11903, 11904, 11905, 11906, 11907, 11908,
			11909 };
	public static int[] FLESH_SPOILER_2 = { 11925, 11926, 11927, 11928, 11929,
			11930, 11931, 11932, 11933, 11934, 11935, 11936, 11937, 11938,
			11939 };
	public static int[] FLESH_SPOILER_SPAWN = { 11910, 11911, 11912, 11913,
			11914, 11915, 11916, 11917, 11918, 11919, 11920, 11921, 11922,
			11923, 11924 };
	public static int[] THUNDEROUS = { 11872, 11873, 11874, 11875, 11876,
			11877, 11878, 11879, 11880, 11881, 11882, 11883, 11884, 11885,
			11886, 12846 };
	public static int[] BLINK = { 11865, 11866, 11867, 11868, 11869, 11870,
			11871, 11872, 11873, 11874, 11875, 11876, 11877, 11878, 11879 };
	public static int[] WARPED_GULEGA = { 5561, 12737, 12738, 12739, 12740,
			12741, 12742, 12743, 12744, 12745, 12746, 12747, 12748, 12749,
			12750, 12751 };
	public static int[] DREADNAUT = { 12848, 12849, 12850, 12851, 12852, 12853,
			12854, 12855, 12856, 12857, 12858, 12859, 12860, 12861, 12862, };
	public static int[] HOPE_DEVOURER = { 12886, 12887, 12888, 12889, 12890,
			12891, 12892, 12893, 12894, 12895, 12896, 12897, 12898, 12899,
			12900 };
	public static int[] WORLD_GORGER = { 12478, 12479, 12480, 12481, 12482,
			12483, 12484, 12485, 12486, 12487, 12488, 12489, 12490, 12491,
			12492, 12493, 12494, 12495, 12496, 12497, 12498, 12499, 12500,
			12501, 12502, 12503, 12504, 12505, 12506, 12507, 12508, 12509,
			12510, 12511, 12512, 12513, 12514, 12515, 12516, 12517, 12518,
			12519, 12520, 12521, 12522, 12523, 12524, 12525, 12526, 12527,
			12528, 12529, 12530, 12531, 12532, 12533, 12534, 12535, 12536,
			12537, 12538, 12539, 12540, 12541, 12542, 12543, 12544, 12545,
			12546, 12547, 12548, 12549, 12550, 12551, 12552, 12553, 12554,
			12555, 12556, 12557, 12558, 12559, 12560, 12561, 12562, 12563,
			12564, 12565, 12566, 12567, 12568, 12569, 12570, 12571, 12572,
			12573, 12574, 12575, 12576, 12577, 12578, 12579, 12580, 12581,
			12582, 12583, 12584, 12585, 12586, 12587, 12588, 12589, 12590,
			12591, 12592, 12593, 12594, 12595, 12596, 12597, 12598, 12599,
			12600, 12601, 12602, 12603, 12604, 12605, 12606, 12607, 12608,
			12609, 12610, 12611, 12612, 12613, 12614, 12615, 12616, 12617,
			12618, 12619, 12620, 12621, 12622, 12623, 12624, 12625, 12626,
			12627, 12628, 12629, 12630, 12631, 12632, 12633, 12634, 12635,
			12636, 12637, 12638, 12639, 12640, 12641, 12642, 12643, 12644,
			12645, 12646, 12647, 12648, 12649, 12650, 12651, 12652, 12653,
			12654, 12655, 12656, 12657, 12658, 12659, 12660, 12661, 12662,
			12663, 12664, 12665, 12666, 12667, 12668, 12669, 12670, 12671,
			12672, 12673, 12674, 12675, 12676, 12677, 12678, 12679, 12680,
			12681, 12682, 12683, 12684, 12685, 12686, 12687, 12688, 12689,
			12690, 12691 };
	public static int[] WARMONGER = { 12752, 12753, 12754, 12755, 12756, 12757,
			12758, 12759, 12760, 12761, 12762, 12763, 12764, 12765, 12766,
			12767, 12768, 12769, 12770, 12771, 12772, 12773, 12774, 12775,
			12776, 12777, 12778, 12779, 12780, 12781, 12782, 12783, 12784,
			12785, 12786, 12787, 12788, 12789, 12790, 12791, 12792, 12793,
			12794, 12795, 12796, 12797, 12798, 12799, 12800, 12801, 12802,
			12803, 12804, 12805, 12806, 12807, 12808, 12809, 12810, 12811,
			12812, 12813, 12814, 12815, 12816, 12817, 12818, 12819, 12820,
			12821, 12822, 12823, 12824, 12825, 12826, 12827, 12828, 12829,
			12830, 12831, 12832, 12833, 12834, 12835, 12836, 12837, 12838,
			12839, 12840, 12841 };

	/*
	 * Interfaces to be used to form a party, select floor and complexity, leave
	 * party, and reset prestige Going to have to go in individual class that
	 * uses it
	 */
	/*
	 * public static Widget MUST_BE_IN_PARTY = new Widget(1186); public static
	 * WidgetChild MUST_BE_IN_PARTY_YES = new WidgetChild(MUST_BE_IN_PARTY, 11);
	 * public static WidgetChild MUST_BE_IN_PARTY_NO = new
	 * WidgetChild(MUST_BE_IN_PARTY, 13);
	 * 
	 * public static Widget PARTY_INTERFACE = new Widget(939); public static
	 * WidgetChild FORM_PARTY = new WidgetChild(PARTY_INTERFACE, 45); public
	 * static WidgetChild LEAVE_PARTY = new WidgetChild(PARTY_INTERFACE, 33);
	 * public static WidgetChild INVITE_PLAYER = new
	 * WidgetChild(PARTY_INTERFACE, 43); public static WidgetChild CHANGE_FLOOR
	 * = new WidgetChild(PARTY_INTERFACE, 110); public static WidgetChild
	 * CHANGE_COMPLEXITY = new WidgetChild(PARTY_INTERFACE, 104); public static
	 * WidgetChild RESET_PRESTIGE = new WidgetChild(PARTY_INTERFACE, 87); public
	 * static int CURRENT_PROGESS = Integer.parseInt(new
	 * WidgetChild(PARTY_INTERFACE, 83).getText()); public static int
	 * PREVIOUS_PROGRESS = Integer.parseInt(new WidgetChild(PARTY_INTERFACE,
	 * 84).getText());
	 * 
	 * public static Widget SELECT_FLOOR_INTERFACE = new Widget(947); public
	 * static HashMap<Integer, WidgetChild> FLOOR_MAP = new HashMap<Integer,
	 * WidgetChild>(); public static void loadFloorMap() { for (int i = 1; i <=
	 * 60; i++) FLOOR_MAP.put(i, new WidgetChild(SELECT_FLOOR_INTERFACE, i +
	 * 607)); } public static WidgetChild CONFIRM_FLOOR = new
	 * WidgetChild(SELECT_FLOOR_INTERFACE, 766);
	 * 
	 * public static Widget COMPLEXITY_INTERFACE = new Widget(938); public
	 * static WidgetChild CONFIRM_COMPLEXITY = new
	 * WidgetChild(COMPLEXITY_INTERFACE, 39); public static WidgetChild[]
	 * COMPLEXITIES = { new WidgetChild(COMPLEXITY_INTERFACE, 60), new
	 * WidgetChild(COMPLEXITY_INTERFACE, 65), new
	 * WidgetChild(COMPLEXITY_INTERFACE, 70), new
	 * WidgetChild(COMPLEXITY_INTERFACE, 75), new
	 * WidgetChild(COMPLEXITY_INTERFACE, 80), new
	 * WidgetChild(COMPLEXITY_INTERFACE, 85)};
	 */
}
