public class Main {
    public static void main(String[] args) {

        Stack_Array s1 = new Stack_Array();
        System.out.println(s1.isEmpty());
        System.out.println("");

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.display();
        System.out.println("");

        System.out.println(s1.isEmpty());
        System.out.println("");

        System.out.println(s1.peak());
        System.out.println("");

        System.out.println(s1.size());
        System.out.println("");

        s1.pop();
        s1.pop();
        s1.display();
        System.out.println("");

        System.out.println(s1.peak());
        System.out.println("");

        System.out.println(s1.size());
        System.out.println("");

        s1.clear();
        System.out.println(s1.isEmpty());

    }
}