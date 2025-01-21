package gr.aueb.cf.ch17.knight;

public class KillTheDragonMission implements IMission {
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public void embark() {
        System.out.println("Kill the dragon mission");
    }
}
