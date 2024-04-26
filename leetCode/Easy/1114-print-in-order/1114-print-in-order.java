class Foo {
    private volatile Integer count = 1;

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count += 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(true) {
            if(count == 2) {
                printSecond.run();
                count+=1;
                return;
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        while(true) {
            if(count == 3) {
                printThird.run();
                count+=1;
                return;
            }
        }
    }
}