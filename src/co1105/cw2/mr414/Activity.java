package co1105.cw2.mr414;

public abstract class Activity implements Comparable<Activity> {

    private static int activityCounter = 0;
    protected final int activityID;
    protected double effort;
    protected int time;


    // More attributes go here...

    public Activity(int t) {
        time = t;
        activityID=++activityCounter;

    }

    // More methods/declarations go here
    public int getID(){
        return activityID;
    }

    public double getEffort(){
        return effort;
    }

    public int getTime(){
        return time;

    }


    @Override
    public int compareTo(Activity o) {
        if (this.equals(o)) return 0;
        else{
            if (this.effort > o.effort) return 1;
            else return -1;
        }

    }

    public abstract String toString();
    public abstract boolean equals(Object o);
    public abstract int hashCode();


}
