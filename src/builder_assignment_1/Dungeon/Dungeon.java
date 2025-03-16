import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<NPC> getNPCs() {
        return npcs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dungeon: ").append(name).append("\n");
        sb.append("Rooms:\n");
        for (Room room : rooms) {
            sb.append("  ").append(room).append("\n");
        }
        sb.append("NPCs:\n");
        for (NPC npc : npcs) {
            sb.append("  ").append(npc).append("\n");
        }
        return sb.toString();
    }
}
