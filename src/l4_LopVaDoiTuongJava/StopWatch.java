package l4_LopVaDoiTuongJava;

public class StopWatch {
    private int startTime;
    private int endTime;

    public StopWatch() {
        this.startTime = (int) System.currentTimeMillis() / 1000;
    }

    public void start() {
        this.startTime = (int) System.currentTimeMillis() / 1000;
    }

    public void stop() {
        this.endTime = (int) System.currentTimeMillis() / 1000;
    }

    public int getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
