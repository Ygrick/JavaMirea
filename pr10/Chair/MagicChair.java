package pr10.Chair;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("μθνσρ ςπθ ευσσσσσσσσσσσσσσ");
    }

    @Override
    public boolean run() {
        doMagic();
        return true;
    }
}