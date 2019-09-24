package com.demo.multithread;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Thread factory for creating threads with name and number.
 * Both for regular threads and daemon threads.
 * 
 * @author epkroan
 * 
 */
public class DaemonFactory implements ThreadFactory {
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String threadName;
    private boolean daemon = false;
    private boolean appendThreadNumber = true;

    public DaemonFactory(String name) {
        SecurityManager securityManager = System.getSecurityManager();
        group = (securityManager != null) ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.threadName = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        String name;
        if (appendThreadNumber) {
            name = this.threadName + "-" + threadNumber.getAndIncrement();
        } else {
            name = this.threadName;
        }
        System.out.println("Thread object creating..");
        Thread thread = new Thread(group, r, name);
        thread.setDaemon(daemon);
        if (thread.getPriority() != Thread.NORM_PRIORITY) {
            thread.setPriority(Thread.NORM_PRIORITY);
        }
        return thread;
    }

    public DaemonFactory appendThreadNumber(boolean appendThreadNumber) {
        this.appendThreadNumber = appendThreadNumber;
        return this;
    }

    public DaemonFactory daemon(boolean daemon) {
        this.daemon = daemon;
        return this;
    }
}
