package lambda;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
