package observer;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " nhận được cập nhật: "+ data);
    }
}
