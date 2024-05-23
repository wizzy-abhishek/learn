package learning;

class LetsLearn{
    public void CallingInterface(LambdaSOUT ml){
        ml.idk();
    }
}
class StillLearning {
    public StillLearning(){
        LetsLearn l = new LetsLearn();
        l.CallingInterface(() -> {
            System.out.println("I have passed this from a method ");
        });
    }
}

public class Lambda3 {
    public static void main(String[] args) {
        new StillLearning();
    }
}
