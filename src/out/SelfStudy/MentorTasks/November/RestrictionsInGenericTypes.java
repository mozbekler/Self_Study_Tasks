//package out.SelfStudy.MentorTasks.November;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RestrictionsInGenericTypes {
//
//    public static void main(String[] args) throws Exception {
//
//        List<int> intList = new ArrayList<int>();
//        List<Integer> integerList = new ArrayList<Integer>();
//
//
//        //You can invoke the append method as follows:
//        List<String> ls = new ArrayList<>();
//        append(ls, String.class);
//
//
//
//    }
//    //You cannot create an instance of a type parameter. For example, the following code causes a compile-time error:
//    public static <E> void append(List<E> list) {
//        E elem = new E();  // compile-time error
//        list.add(elem);
//    }
//    //As a workaround, you can create an object of a type parameter through reflection:
//    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
//        E elem = cls.newInstance();   // OK
//        list.add(elem);
//
//
//    }
//
//    //A class's static field is a class-level variable shared by all non-static objects of the class.
//    // Hence, static fields of type parameters are not allowed. Consider the following class:
//
//    public class MobileDevice<T> {
//        private static T os;
//
//        // ...
//    }
//    //If static fields of type parameters were allowed, then the following code would be confused:
//
//    MobileDevice<Smartphone> phone = new MobileDevice<>();
//    MobileDevice<Pager> pager = new MobileDevice<>();
//    MobileDevice<TabletPC> pc = new MobileDevice<>();
//   // Because the static field os is shared by phone, pager, and pc, what is the actual type of os?
//    // It cannot be Smartphone, Pager, and TabletPC at the same time.
//    // You cannot, therefore, create static fields of type parameters.
//
//    //Because the Java compiler erases all type parameters in generic code,
//    // you cannot verify which parameterized type for a generic type is being used at runtime:
//    public static <E> void rtti(List<E> list) {
//        if (list instanceof ArrayList<Integer>) {  // compile-time error
//            // ...
//        }
//    }
//   // The set of parameterized types passed to the rtti method is:
//
//   // S = { ArrayList<Integer>, ArrayList<String> LinkedList<Character>, ... }
//   // The runtime does not keep track of type parameters, so it cannot tell the difference between
//   // an ArrayList<Integer> and an ArrayList<String>.
//   // The most you can do is to use an unbounded wildcard to verify that the list is an ArrayList:
//    public static void rtti(List<?> list) {
//        if (list instanceof ArrayList<?>) {  // OK; instanceof requires a reifiable type
//            // ...
//        }
//    }
//    //Typically, you cannot cast to a parameterized type unless it is parameterized by unbounded wildcards.
//    // For example:
//
//    List<Integer> li = new ArrayList<>();
//    List<Number>  ln = (List<Number>) li;  // compile-time error
//
//
//    //You cannot create arrays of parameterized types. For example, the following code does not compile:
//
//    List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error
//   // The following code illustrates what happens when different types are inserted into an array:
//
//    Object[] strings = new String[2];
//    strings[0] = "hi";   // OK
//    strings[1] = 100;    // An ArrayStoreException is thrown.
//    //If you try the same thing with a generic list, there would be a problem:
//
//    Object[] stringLists = new List<String>[2];  // compiler error, but pretend it's allowed
//    stringLists[0] = new ArrayList<String>();   // OK
//    stringLists[1] = new ArrayList<Integer>();  // An ArrayStoreException should be thrown,
//    // but the runtime can't detect it.
//    //If arrays of parameterized lists were allowed, the previous code would fail to throw
//    // the desired ArrayStoreException.
//
//
//
//
//
//}
