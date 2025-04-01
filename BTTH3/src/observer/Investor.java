package observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " nhận được cập nhật: "+ data);
    }
}
