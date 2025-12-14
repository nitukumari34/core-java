class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName()
                + " is using pen " + this + " and trying to access paper");
        paper.finishwriting();
    }

    public synchronized void finishwriting() {
        System.out.println(Thread.currentThread().getName()
                + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName()
                + " is using paper " + this + " and trying to access pen");
        pen.finishwriting();
    }

    public synchronized void finishwriting() {
        System.out.println(Thread.currentThread().getName()
                + " finished using paper " + this);
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen) {
            synchronized (paper) {
                pen.writeWithPenAndPaper(paper);
            }
        }
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen) {
            synchronized (paper) {
                paper.writeWithPaperAndPen(pen);
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread t2 = new Thread(new Task2(pen, paper), "Thread-2");

        t1.start();
        t2.start();
    }
}
