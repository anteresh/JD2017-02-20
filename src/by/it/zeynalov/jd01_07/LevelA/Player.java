package by.it.zeynalov.jd01_07.LevelA;

public abstract class Player implements ITech {
    private boolean isPlay;
    private boolean isPause;
    private String name;

    public String getName() {
        return name;
    }

    public boolean isPause() {
        return isPause;
    }

    public Player(String name) {
        this.name = name;
        isPlay = false;
        isPause = false;
    }

    public boolean isPlay() {
        return isPlay;
    }

    public void setPause(boolean pause) {
        isPause = pause;
    }

    @Override
    public void play() {
        isPlay = true;
        isPause = false;
    }

    @Override
    public void pause() {
        isPause = !isPause;
    }

    @Override
    public void stop() {
        isPlay = false;
        isPause = false;
    }

    public void showState() {
        System.out.println("Hi");
    }

    public void showState(String prefix) {
        System.out.println(prefix);
    }
}
