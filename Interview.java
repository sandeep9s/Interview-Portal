
public class Interview {
    private int id;
    private String participant;
    private String startTime;
    private String endTime;

    public Interview(int id, String participant, String startTime, String endTime) {
        this.id = id;
        this.participant = participant;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() { return id; }
    public String getParticipant() { return participant; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }

    public void setId(int id) { this.id = id; }
    public void setParticipant(String participant) { this.participant = participant; }
    public void setStartTime(String startTime) { this.startTime = startTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }
}
