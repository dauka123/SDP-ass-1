public interface ISit extends IDo{
    @Override
    default String ido() {
        return "I'm sitting";
    };
}
