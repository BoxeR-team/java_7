package homeWork1;

public class ifCase {
    public void iftest(){
        boolean b = true;
        if (b) {
            System.out.println("b " + b);
        }
            if (!b) {
                System.out.println("not b  = " + b);
            }

            boolean bb = true;
            if (bb) {
                System.out.println("bb = " + bb);
            }
            else {
                System.out.println("Not bb -" + bb);
            }
            int a = 6;
            if (a <= 5) {
                System.out.println("a <= 5");
            } else if (a < 9 && a > 5) {
                System.out.println("a <= 9");
            } else if (a == 10) {
            System.out.println("a == 10");
        } else if (a > 10) {
            System.out.println("a > 10");
        }

            int aa = 10;
            if (aa == 5){
                System.out.println("aa =5 ");
            }
        if (aa == 7){
            System.out.println("aa = 7 ");
        }if (aa == 10){
            System.out.println("aa = 10 ");
        }
        switch (aa){
            case 5 -> System.out.println("aa = 5 ");
            case 7 -> System.out.println("aa = 7");
            case 10 -> System.out.println("aa = 10");
            default -> System.out.println("aa =  something");
        }
    }
}
