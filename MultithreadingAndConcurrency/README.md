# Multitasking

Multitasking allows several activities to occur concurrently on a computer. There are two main types of multitasking:

1. **Process-based Multitasking**
2. **Thread-based Multitasking**

## Process-based Multitasking

Process-based multitasking allows multiple processes (i.e., programs) to run concurrently on the computer. 

**Example:** Running MS Paint while also working on a word processor.

## Thread-based Multitasking

Thread-based multitasking allows different parts of the same program to run concurrently on the computer.

**Example:** MS Word printing a document while formatting text at the same time.

## Threads vs Processes

- **Shared Address Space:** Two threads share the same address space.
- **Context Switching:** Context switching between threads is usually less expensive than between processes.
- **Communication Cost:** The cost of communication between threads is relatively low.

## Why Multithreading?

- **Single-threaded Limitation:** In a single-threaded environment, only one task can be performed at a time.
- **CPU Utilization:** CPU cycles are wasted when waiting for user input. Multitasking allows idle CPU time to be put to good use.

## Threads

A thread is an independent sequential path of execution within a program. Many threads can run concurrently within a program. At runtime, threads in a program exist in a common memory space and can share both data and code, making them lightweight compared to processes.

## Three Important Concepts Related to Multithreading in Java

1. **Creating Threads:** Providing the code that gets executed by a thread.
2. **Synchronization:** Accessing common data and code through synchronization.
3. **Thread States:** Transitioning between different thread states

## The main thread :
- When a standalone application is run , a user thread is automatically created to execute the main() method of the application . This thread is called main thread .

- If no other user threads are spawned , the program terminates when the main() method finish executing .
- All other threads called child threads, are spawned from the main thread.
- The main() method can then finish ,but the program will keep running untill all user threads have completed .
- The runtime environment distinguishes between user threads and daemon threads.


## Thread creation in java :- 
- A thread in java is represented by an object of the thread class. 

- Creating threads is achieved in one of two ways :
    1. Implementing the java.lang.Runnable interface
    2. Extending the java.lang.Thread class