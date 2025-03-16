public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Cloneable Room", "A room that can be cloned easily");

        Room roomClone1 = prototypeRoom.cloneEntity();
        Room roomClone2 = prototypeRoom.cloneEntity();
        Room roomClone3 = prototypeRoom.cloneEntity();

        roomClone1 = new Room(roomClone1.getName() + " Clone #1", roomClone1.getDescription());
        roomClone2 = new Room(roomClone2.getName() + " Clone #2", roomClone2.getDescription());
        roomClone3 = new Room(roomClone3.getName() + " Clone #3", roomClone3.getDescription());

        System.out.println("Prototype Room: " + prototypeRoom);
        System.out.println("Room Clone 1: " + roomClone1);
        System.out.println("Room Clone 2: " + roomClone2);
        System.out.println("Room Clone 3: " + roomClone3);
    }
}
