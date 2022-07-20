public class Bus extends Transportation{
    // 현재 승객 수
    private int nowPassenger;
    // 요금
    private int fare;
    // 현재 속도
    private int speedCurrent;
    // 상태
    private String state;


    // -------------------------------- 생성자 시작 --------------------------------
    // 객체 생성시 번호는 고유값으로 생성, 최초 상태는 '운행'
    public Bus(int passenger) {
        // 기본값: 고유값 번호
        this.setNumber(generateNumber()); // 나중에 Transportation에서 메서드 구현 후 생성자에 추가
        // 기본값: 요금
        this.fare = 1000 * passenger; // 승객 수만큼 요금 산정
        // 기본값: 최대 승객 수
        this.setMaxPassenger(30);
        this.setNowPassenger(passenger);
        // 기본값: 상태
        this.setState("운행");
    }
    // -------------------------------- 생성자 끝 --------------------------------

    // -------------------------------- Getter 및 Setter 시작 --------------------------------
    public int getNowPassenger() {
        return nowPassenger;
    }

    public void setNowPassenger(int nowPassenger) {
        if (nowPassenger > this.getMaxPassenger()) {
            System.out.println("최대 승객 수 초과");
            this.nowPassenger = 0; // 최대 승객 수 초과 시 승객 수 0으로 초기화
        } else {
            this.nowPassenger = nowPassenger;
            this.setFare(1000 * nowPassenger); // 승객 수만큼 요금 산정
        }
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getSpeedCurrent() {
        return speedCurrent;
    }

    public void setSpeedCurrent(int speedCurrent) {
        this.speedCurrent = speedCurrent;
    }

    public String getState() {
        if (this.getFuel() < 10) {
            this.state = "차고지 행";
            return "차고지 행\n주유 필요";
        } else {
            return state;
        }
    }

    public void setState(String state) {
        if (this.getFuel() < 10) {
            System.out.println("주유 필요");
            this.state = "차고지 행";
        } else {
            if (state == "운행" || state == "차고지 행") {
                this.state = state;
            } else {
                System.out.println("'운행'과 '차고지 행' 중 하나의 값을 입력해주세요");
            }
        }
    }
    // -------------------------------- Getter 및 Setter 끝 --------------------------------

    // -------------------------------- 기능 시작 --------------------------------
    @Override
    void changeSpeed(int speed) {
        speedCurrent = this.getSpeedInitial() + speed;
    }

    // -------------------------------- 기능 끝 --------------------------------
}
