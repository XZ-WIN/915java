package com.zhongye;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable=new MyCallable();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future=executorService.submit(callable);
        String ret=future.get();
        System.out.println(ret);
    }

}


class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        return new String("xz");
    }
}
