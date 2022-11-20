public class factoria implements Runnable {

    Integer[] list;

    public factoria(Integer[] a){
        this.list = a;
    }
    public void run(){
        int resultado = 1;
        for (int i = 0; i < list.length; i++){
            if (list[i] != 0 && list[i] > 0) {
                for (int j = 1; j < list[i]; j++) {
                    resultado = resultado * j;
                }
                System.out.println(Thread.currentThread().getName() + ". El resultado para este Thread con factor de " + list[i] + " es: " + resultado);
            } else if (list[i] == 0){
                System.out.println(Thread.currentThread().getName() + ". El resultado para este Thread con factor de " + list[i] + " es: " + 1);
            } else {
                System.out.println("Para el Thread: " + Thread.currentThread().getName() + " no hay factorial");
            }
        }

    }
}