package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Investor investor1 = new Investor("Nghiệm");
        Investor investor2 = new Investor("Thanh");
        stock.attach(investor1);
        stock.attach(investor2);
        stock.setPrice(200);
        stock.setPrice(300);

        Task task = new Task();
        TeamMember teamMember1 = new TeamMember("Hoàng");
        TeamMember teamMember2 = new TeamMember("Phú");
        task.attach(teamMember1);
        task.attach(teamMember2);
        task.setStatus("In progress");
        task.setStatus("Completed");
    }
}
