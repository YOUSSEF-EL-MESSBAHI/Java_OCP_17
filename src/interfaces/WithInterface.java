package interfaces;

public class WithInterface implements InterfaceSummary{
    @Override
    public int abstractMethod() {
        defaultMethod();
        InterfaceSummary.staticMethod();
        return CONSTANT;
    }
}
