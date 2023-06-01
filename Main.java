package lambda;

public class Main {
    public static void main(String[] args) {

        //WORKER
        OnTaskDoneListener listener = System.out::println;
        OnErrorTaskListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();


        //КАЛЬКУЛЯТОР
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);
       

        //Так как происходит деление на 0, выбрасывается Runtime исключение ArithmeticException
        //Обработать мы его можем с помощью блока try/catch
        // Можем пометить в методе с помощью throws что в методе возможно возникновение исключения
        // Можем просто выбрость
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);


    }
}
