package ru.otus.hw7_exceptions;



import java.io.IOException;
import java.util.logging.*;

public class Main {

    private static Logger log = Logger.getLogger(Main.class.getName());

    public void logLog() {
        log.info("Hi, I'm logger");
    }

    public static void main(String[] args) {
        //Logger logger = LoggerFactory.getLogger(Main.class);
        //System.out.println(Main.class);
        //logger.info("start");
//        Main main = new Main();
//
//        main.logLog();
//
//        try {
//            throw new Exception("new exception");
//        } catch (Exception e) {
//            log.log(Level.SEVERE, "Exception: ", e);
//        }
//        log.fine("debug message");
//
//        if(log.isLoggable(Level.FINE)){
//            log.fine("Some CPU consuming message: " );
//        }
        /////////////////////////////////////////////////////////////////
        Factorial factorial = new Factorial();
        KeyboardInput in = new KeyboardInput();

        try {

            int x = Integer.parseInt(in.getInput().readLine());
            if (x == (int) x) {
                System.out.println("NUMBER");
            } else {
                System.out.println("NOT Number");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(factorial.getFactorial(0));
        } catch (FactorialException e) {
            e.printStackTrace();
        }




    }
}
