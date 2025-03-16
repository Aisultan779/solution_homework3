public class MUDCombinedDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Combined Dungeon")
                .addRoom(new Room("Entrance", "The starting room"))
                .addNPC(new NPC("Orc", "A fierce warrior"))
                .build();

        Room templateRoom = new Room("Template Room", "This is a template room");

        for (int i = 1; i <= 3; i++) {
            Room clonedRoom = templateRoom.cloneEntity();
            clonedRoom = new Room(clonedRoom.getName() + " Clone #" + i, clonedRoom.getDescription());
            dungeon.getRooms().add(clonedRoom);
        }

        System.out.println(dungeon);
    }
}
