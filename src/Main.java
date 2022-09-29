public class Main {

    public static void main(String[] args) {
        Outer o1 = new Outer(100);
        Outer o2 = new Outer(200);

        Outer.Inner i11 = o1.new Inner(10);
        Outer.Inner i12 = o1.new Inner(11);

        Outer.Inner i21 = o2.new Inner(20);
        Outer.Inner i22 = o2.new Inner(21);

        o1.display();
        i11.display();
        i12.display();

        i11.increment();
        System.out.println();
        o1.display();
        i11.display();
        i12.display();


        System.out.println();
        System.out.println();

        o2.display();
        i21.display();
        i22.display();
    }
}
