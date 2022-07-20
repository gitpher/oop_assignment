import java.util.Arrays;

abstract class Transportation {

    // 번호
    private String number;
    // 주유량
    private int fuel;
    // 원래의 속도
    private int speedInitial;
    // 최대 승객 수
    private int maxPassenger;

    // -------------------------------- 생성자 시작 --------------------------------
    public Transportation() {
        // 기본값
        this.number = generateNumber();  // 나중에 고유값으로 해줘야 함.
        this.speedInitial = 0;
        this.fuel = 100;
    }
    // -------------------------------- 생성자 끝 --------------------------------

    // -------------------------------- Getter 및 Setter 시작 --------------------------------
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSpeedInitial() {
        return speedInitial;
    }

    public void setSpeedInitial(int speedInitial) {
        this.speedInitial = speedInitial;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
    // -------------------------------- Getter 및 Setter 끝 --------------------------------

    // -------------------------------- 기능 시작 --------------------------------
    // 속도 변경
    abstract void changeSpeed(int speed);


    // GenerateNumber() exists
    private static boolean exists(int n[], int index) {
        for (int i = 0; i < n.length; i++) {
            if(n[i] == index)
                return true;
        }
        return false;
    }

    String generateNumber() {

        int n[] = new int[4];
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            do {
                index = (int) (Math.random() * 10);
            } while (exists(n, index));
            n[i] = index;
        }
        return Arrays.toString(n).replaceAll("[^0-9]","");
    }
    // -------------------------------- 기능 끝 --------------------------------

}
