package function;

public class $2_vectorAccess {
    public static void main(String[] args) {
        // Access and print the static ArrayList directly
        System.out.println(data.$3_vector.a);
        data.$3_vector.a.add(14);
        System.out.println(data.$3_vector.a);
        System.out.println(data.$3_vector.a.get(0));
        data.$3_vector.a.remove(0);
        System.out.println(data.$3_vector.a);
        data.$3_vector.a.set(0, 100);
        System.out.println(data.$3_vector.a);
        for(int i:data.$3_vector.a){
            System.out.print(i+" ");
        }
    }
}
