package learning;


interface LambdaSOUT{
    void idk();
}

interface LambdaVar{
    void letsCheck();
}

@FunctionalInterface
interface MyLambda{
    void display();
}

@FunctionalInterface
interface MyParaLambda{
    void show (String str);
}

@FunctionalInterface
interface LambdaAdd{
    int add(int a , int b);
}