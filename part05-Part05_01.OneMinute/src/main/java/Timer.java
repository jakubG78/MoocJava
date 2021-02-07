
public class Timer {

    private ClockHand seconds;
    private ClockHand hundretsOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundretsOfSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundretsOfSeconds.advance();

        if (this.hundretsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + hundretsOfSeconds;
    }
}
