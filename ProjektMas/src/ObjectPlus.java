import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ObjectPlus implements Serializable {
    private static Map<Class<? extends ObjectPlus>, List<ObjectPlus>> allExtends = new HashMap<>();

    public ObjectPlus() {
        List<ObjectPlus> extent = null;
        Class clazz = this.getClass();

        if (allExtends.containsKey(clazz)) {
            extent = allExtends.get(clazz);
        } else {
            extent = new ArrayList<>();
            allExtends.put(clazz, extent);
        }
        extent.add(this);
    }

    public static void writeExtents(ObjectOutputStream stream) throws IOException {
        stream.writeObject(allExtends);
    }

    public static void readExtents(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        allExtends = (HashMap<Class<? extends ObjectPlus>, List<ObjectPlus>>) stream.readObject();
    }

    public static void showExtent(Class<?> theClass) throws Exception {
        List<ObjectPlus> extent = allExtends.get(theClass);
        if (extent == null) {
            throw new Exception("Unknown class " + theClass);
        }
        System.out.println("Extent of the class: " + theClass.getSimpleName());
        for (Object obj : extent) {
            System.out.println(obj);
        }
    }
}



//    public static void writeExtents(ObjectOutputStream stream) throws IOException {
//        stream.writeObject(allExtends); }
//
//    public static void readExtents(ObjectInputStream stream) throws IOException, ClassNotFoundException {
//        allExtends = (HashMap<Class<? extends ObjectPlus>, List<ObjectPlus>>) stream.readObject();
//
//}
//    public static void showExtent(Class theClass) throws Exception {
//        List<ObjectPlus> extent = null;
//        if(allExtends.containsKey(theClass)) { // Extent of this class already exist
//            extent = allExtends.get(theClass); }
//        else {
//            throw new Exception("Unknown class " + theClass);
//        }
//        System.out.println("Extent of the class: " + theClass.getSimpleName());
//        for(Object obj : extent) {
//            System.out.println(obj); }
//    }
//
//
//
//
//
//}