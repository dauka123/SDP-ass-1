public interface IRun extends IDo{
    @Override
    default String ido() {
        return "I'm running";
    };
}
