

public class factorial {
    public static void main(String[] args) {
        Integer[] a ;
        a = new Integer[args.length];

        for(int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }

        Thread t1 = new Thread(new factoria(a));
        Thread t2 = new Thread(new factoria(a));
        t1.setName("+Thread 1+");
        t2.setName("+Thread 2+");
        t1.start();
        t2.start();
    }
}