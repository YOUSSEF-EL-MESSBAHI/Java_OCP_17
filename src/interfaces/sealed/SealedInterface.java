package interfaces.sealed;

sealed public interface SealedInterface permits SubInterfaceSealed {
    void method();
}
