package com.ilanpillemer.pingpong;
// Import the necessary Java synchronization and scheduling classes.

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

/**
 * @class PingPongRight
 *
 * @brief This class implements a Java program that creates two
 *        instances of the PlayPingPongThread and start these thread
 *        instances to correctly alternate printing "Ping" and "Pong",
 *        respectively, on the console display.
 */
public class PingPongRight
{
    /**
     * @class SimpleSemaphore
     *
     * @brief This class provides a simple counting semaphore
     *        implementation using Java a ReentrantLock and a
     *        ConditionObject.
     */
    static public class SimpleSemaphore
    {
     
    }

    /**
     * @class PlayPingPongThread
     *
     * @brief This class implements the ping/pong processing algorithm
     *         using the SimpleSemaphore to alternate printing "ping"
     *         and "pong" to the console display.
     */
    public static class PlayPingPongThread extends Thread
    {
    }

    /**
     * The main() entry point method into PingPongRight program. 
     */
    public static void main(String[] args) {
    }
}
