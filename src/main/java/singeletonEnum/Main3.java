package singeletonEnum;

public class Main3 {
    public static void main(String[] args) {

        DatabaseeConection db = DatabaseeConection.INSTANCE;
        DatabaseeConection db2 = DatabaseeConection.INSTANCE;

        System.out.println(db.hashCode());
        System.out.println(db2.hashCode());

        db.set_values("uell","dinesh", "dinesh124");

        System.out.println(db.get_username());
    }
}
