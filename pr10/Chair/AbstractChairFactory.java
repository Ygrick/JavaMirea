package pr10.Chair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionChair createFunctionalChair();
}