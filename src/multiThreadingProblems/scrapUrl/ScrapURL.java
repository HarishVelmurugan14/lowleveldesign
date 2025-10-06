package multiThreadingProblems.scrapUrl;

import java.util.concurrent.Callable;

public class ScrapURL implements Callable<Void>
{

//    Why callable instead of runnable it doesn't return anything right ?
//    Since it is sleeping we should hold the thread till then :  Hence callable
//    : runnable cuts connection with main thread

//    Objective
//    Understand the difference between FixedThreadPool and CachedThreadPool by simulating a web scraper.
//    Problem Statement
//    Given a list of 100 URLs (e.g., "http://example.com/pageX"), simulate fetching the page content using Thread.sleep(200ms).
//    Implement two versions:
//    Use a FixedThreadPool(10) to process 10 URLs at a time.
//    Use a CachedThreadPool to process them dynamically.
//    Compare the execution time for both approaches.

    private String url;

    public ScrapURL(String url)
    {
        this.url = url;
    }

    @Override
    public Void call() throws Exception
    {
        /* Simulating web scraping */
        Thread.sleep(500);

        return null;
    }
}
