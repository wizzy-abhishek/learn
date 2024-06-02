package learning_java.collection_framework;


import java.util.TreeSet;

class Score implements Comparable{
    int x ; int y ;
    int totalScore ;

    public Score(int x , int y){
        this.x = x ;
        this.y = y ;
        this.totalScore = x + y ;
    }

    @Override
    public int compareTo(Object o) {
        Score s = (Score) o ;
        return Integer.compare(s.totalScore, this.totalScore);
    }

    @Override
    public String toString(){
        return String.valueOf(totalScore);
    }

    public Score(){

    }
}

public class Cf14_comparable {
    public static void main(String[] args) {
        Score sc = new Score();
        TreeSet<Score> ts = new TreeSet<>();
        ts.add(new Score(1,2));
        ts.add(new Score(6,84));
        ts.add(new Score(2,1));
        ts.add(new Score(4,4));

        ts.forEach(System.out::println);

    }
}