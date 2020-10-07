class Outside{

    int a = 10;
    class Inside{

        int b = 20;
    }
}




public class InnerClass {
    /*
    Class inside class is inner class
     */
    public static void main(String[] args) {

        Outside outside = new Outside();
        Outside.Inside inside = outside.new Inside();
        System.out.println(outside.a +" "+inside.b);

    }
}
