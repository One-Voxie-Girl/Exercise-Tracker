package co1105.cw2.mr414;


import java.util.Objects;

public class Swim extends Activity{
    private int poolSize;
    private int numLengths;


    public Swim(int psize, int num,int t){
        super(t);
        poolSize=psize;
        numLengths=num;
        effort=(getDistance()*20)/(double)t;
    }


    public int getDistance(){
        return poolSize*numLengths;
    }


    @Override
    public String toString(){
        //pain
        return String.format("S%02d: effort score %#4.1f (%d x %dm in %#4.1fminutes)",getID(),getEffort(),numLengths,poolSize,(float)getTime()/60);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swim swim = (Swim) o;
        return poolSize == swim.poolSize && numLengths == swim.numLengths && time == swim.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolSize, numLengths,time);
    }

}
