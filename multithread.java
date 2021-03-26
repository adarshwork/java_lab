//Implementation of Multithreading

//Class for Thread Life Cycle Phases
class thread implements Runnable 
{ 
    //method to run the thread
    public void run() 
    { 
        // moving thread2 to timed waiting state 
        try
        { 
            //thread goes to sleep for 1500 milliseconds i.e., 1.5 seconds
            Thread.sleep(1500); 
        }  
        catch (InterruptedException e)  
        { 
            //display exception details
            e.printStackTrace(); 
        } 
          
        System.out.println("State of thread1 while it called join() method on thread2: " + 
            multithread.thread1.getState()); 
        try
        { 
            //thread goes to sleep for 200 milliseconds
            Thread.sleep(200); 
        }  
        catch (InterruptedException e)  
        { 
            //display exception details
            e.printStackTrace(); 
        }      
    } 
} 

//Class for Thread Priority
class multithreadMultiPriority1 extends Thread
{  
    // method to print the running thread name and its priority
    public void run()
    {  
       System.out.println("Running Thread Name: "+Thread.currentThread().getName());  
       System.out.println("Running Thread Priority: "+Thread.currentThread().getPriority());  
      
    } 
} 

//Class for Thread Synchronization
class Table
{  
    //synchronized method 
    synchronized void printTable(int n)
    { 
       for(int i=1;i<=5;i++)
       {  
             System.out.println(n*i);  
             try
             {  
                //thread goes to sleep for 400 milliseconds
                Thread.sleep(400);  
             }
             catch(Exception e)
             {
                System.out.println(e);
             }  
        }  
      
    }  
}   
//Class for Thread Synchronization
class MyThread1 extends Thread
{  
    //object creation
    Table t;

    //parameterized constructor
    MyThread1(Table t)
    {  
        //refer to the current class instance
        this.t=t;  
    }  
    //method to run the thread
    public void run()
    {  
        //thread invoking synchronized method
        t.printTable(5);  
    }  
      
} 
//Class for Thread Synchronization 
class MyThread2 extends Thread
{  
    //object creation
    Table t; 

    //parameterized constructor
    MyThread2(Table t)
    {  
        //refer to the current class instance
        this.t=t;  
    }  
    //method to run the thread
    public void run()
    {  
        //thread invoking synchronized method
        t.printTable(100);  
    }  
}

//Class for Inter-thread Communication
class Chat 
{
    //declare and initialize the flag to false
    boolean flag = false;

    //synchronized method to display the questions
    public synchronized void Question(String msg)
    {
       //checks if the flag is set to true
       if (flag)
       {
            try 
            {
                //causes the current thread to wait until another thread invokes the notify().
                wait();
            } 
            catch (InterruptedException e)
            {
                //display the details of the exception
                e.printStackTrace();
            }
        }
        //display the question
        System.out.println(msg);
        //set the flag to true
        flag = true;
        //wakes up a single thread that is waiting on this object's monitor.
        notify();
    }

   //synchronized method to display the answers
   public synchronized void Answer(String msg) 
   {
       //checks if the flag is set to false
       if (!flag) 
       {
            try 
            {
                //causes the current thread to wait until another thread invokes the notify().
                wait();
            } 
            catch (InterruptedException e) 
            {
                //display the details of the exception
                e.printStackTrace();
            }
        }
        //display the question
        System.out.println(msg);
        //set the flag to false
        flag = false;
        //wakes up a single thread that is waiting on this object's monitor.
        notify();
   }
}
//Class for Inter-thread Communication
class T1 implements Runnable 
{
   //object creation
   Chat m;
   //create a array of string for questions
   String[] s1 = { "Hi, I am Thread T1", "I am implementing Runnable Class", "Ok Bye!" };
   //parameterized constructor
   public T1(Chat m1) 
   {
      //refer to the current class instance
      this.m = m1;
      //starting the thread
      new Thread(this, "Question").start();
   }
   //method to run the thread
   public void run()
   {
      //loop to invoke the Question() method in sync
      for (int i = 0; i < s1.length; i++) 
      {
        //invoke synchronized Question method
        m.Question(s1[i]);
      }
   }
}
//Class for Inter-thread Communication
class T2 implements Runnable 
{
   //object creation
   Chat m;
   //create a array of string for answers
   String[] s2 = { "Hello, I am Thraed T2", "Same here, even I am implementing Runnable Class", "Bye-Bye!" };
   //parameterized constructor
   public T2(Chat m2) 
   {
      //refer to the current class instance
      this.m = m2;
      //starting the thread
      new Thread(this, "Answer").start();
   }
   //method to run the thread
   public void run()
   {
      //loop to invoke the Answer() method in sync
      for (int i = 0; i < s2.length; i++) 
      {
        //invoke synchronized Question method
        m.Answer(s2[i]);
      }
   }
}
 
//Main class for Multithreading 
public class multithread implements Runnable 
{ 
    //object creation
    public static Thread thread1; 
    public static multithread obj; 
      
    public static void main(String[] args) 
    { 
        System.out.println("2047203 - ADARSH JHUNJHUNWALA");

        //Thread Life Cycle Phases
        //Object creation
        obj = new multithread(); 
        thread1 = new Thread(obj); 

        // thread1 created and is currently in the NEW state.  
        System.out.println("State of thread1 after creating it:  " + thread1.getState()); 
        thread1.start(); 
        
        // thread1 moved to Runnable state 
        System.out.println("State of thread1 after calling .start() method on it: " +  
            thread1.getState()); 


        //Thread Priority
        //Object creation
        multithreadMultiPriority1 m1=new multithreadMultiPriority1();  
        multithreadMultiPriority1 m2=new multithreadMultiPriority1();  
        // setting the priority of threads
        m1.setPriority(Thread.MIN_PRIORITY);  
        m2.setPriority(Thread.MAX_PRIORITY); 
        //starting the threads 
        m1.start();  
        m2.start(); 


        //Thread Synchronization
        //Object creation
        Table obj = new Table();  
        MyThread1 t1=new MyThread1(obj);  
        MyThread2 t2=new MyThread2(obj);  
        //starting the threads 
        t1.start();  
        t2.start(); 

        //Inter-thread Communication
        //Object creation
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    } 
    
    //Method for Thread Life Cycle Phases  
    //method to run the thread
    public void run() 
    { 
        //object creation
        thread myThread = new thread(); 
        Thread thread2 = new Thread(myThread); 
        
        // thread1 created and is currently in the NEW state.  
        System.out.println("State of thread2 after creating it: "+ thread2.getState()); 
        thread2.start(); 

        // thread2 moved to Runnable state   
        System.out.println("State of thread2 after calling .start() method on it: " +  
            thread2.getState()); 
           
        try
        {  
            //moving thread1 to timed waiting state
            Thread.sleep(200); 
        }  
        catch (InterruptedException e)  
        { 
            //display the details of the exception
            e.printStackTrace(); 
        } 
        //display the state of thread
        System.out.println("State of thread2 after calling .sleep() method on it: "+  
            thread2.getState() ); 
          
          
        try 
        { 
            // waiting for thread2 to die
            thread2.join(); 
        }  
        catch (InterruptedException e)  
        { 
            //display the details of the exception
            e.printStackTrace(); 
        } 
        //display the state of thread
        System.out.println("State of thread2 when it has finished it's execution: " +  
            thread2.getState()); 
    } 
}
