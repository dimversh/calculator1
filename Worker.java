package lambda;

public class Worker {
    private OnTaskDoneListener callback;
    private OnErrorTaskListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnErrorTaskListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Error in task " + i);
            }

        }
    }
}



