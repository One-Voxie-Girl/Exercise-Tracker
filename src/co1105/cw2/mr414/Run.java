package co1105.cw2.mr414;

import java.util.Objects;

public class Run extends Activity{
    private int distance;

    public Run(int d, int t) throws InvalidActivityException{
        super(t);
        if (!((0<d)&&(d<100000))) throw new InvalidActivityException("Distance must be between 0m and 100000m");
        else if ((d/t)>20) throw new InvalidActivityException("Speed is not possible");
        distance=d;
        effort=(4*d)/(double)t;
    }
    public int getDistance(){
        return distance;
    }


    @Override
    public String toString(){
        //pain
        return String.format("R%02d: effort score %.1f (%#4.1fkm in %#4.1fminutes)",activityID,effort,(float)distance/1000.0,(double)time/60.0);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Run run = (Run) o;
        return distance == run.distance && time == run.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance,time);
    }


}
