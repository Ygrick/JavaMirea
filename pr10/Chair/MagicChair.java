package pr10.Chair;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("����� ��� ����������������");
    }

    @Override
    public boolean run() {
        doMagic();
        return true;
    }
}