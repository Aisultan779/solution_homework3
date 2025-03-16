public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();

        Dungeon dungeon = builder.setDungeonName("Mystic Dungeon")
                .addRoom(new Room("Entrance Hall", "A dark and gloomy entrance"))
                .addRoom(new Room("Treasure Room", "Room filled with glittering treasures"))
                .addNPC(new NPC("Goblin", "A small and mischievous creature"))
                .addNPC(new NPC("Dragon", "A fearsome beast guarding the treasure"))
                .build();

        System.out.println(dungeon);
    }
}
