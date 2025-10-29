public class Application {
    private static Application instance;
    private int queueNumber;
    private boolean isReset;

    private Application() {
        queueNumber = 0;
        isReset = false;
    }

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }
        return instance;
    }

    public synchronized int getQueueNumber() {
        return queueNumber;
    }

    public synchronized void addQueueNumber() {
        if (isReset) {
            queueNumber--;
            isReset = false;
        }
        queueNumber++;
    }

    public synchronized void resetQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
        this.isReset = true;
    }


}
