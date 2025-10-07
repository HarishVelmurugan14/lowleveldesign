package aa83_multiThreadingProblems.additionMultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Client
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int ARRAY_SIZE = 1_000_000;
        List<Integer> array = new ArrayList<>(ARRAY_SIZE);

        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++)
        {
            array.add(Integer.valueOf(random.nextInt(100)));
        }

        // Fetches the number of available processor
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(cores);
        List<Future<Long>> futures = new ArrayList<>();

        // Split the entire list each for each thread we have
        int chunkSize = ARRAY_SIZE / cores;
        for (int i = 0; i < cores; i++)
        {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? ARRAY_SIZE : (i + 1) * chunkSize;

            Callable<Long> callable = new AdditionMultiThread(array, start, end); // Loose Coupling
            // AdditionMultiThread additionMultiThread = new AdditionMultiThread(array, start, end); // Can be done as well

            // Why future ? making all loops wait till all results are obtained from their respective threads
            Future<Long> future = executorService.submit(callable);
            futures.add(future);
            // why not future.get() here ? it ends loop and makes it sequential
        }

        long total = 0L;
        for (Future<Long> future : futures)
        {
            total += future.get();
        }

        executorService.shutdown();
        System.out.println("The total is " + total);
    }
}
