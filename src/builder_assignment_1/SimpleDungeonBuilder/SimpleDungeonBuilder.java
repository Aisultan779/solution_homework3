import java.util.ArrayList;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String dungeonName;
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<NPC> npcs = new ArrayList<>();

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.dungeonName = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        this.rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        this.npcs.add(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(dungeonName, rooms, npcs);
    }
}
