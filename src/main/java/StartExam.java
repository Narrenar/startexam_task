// Emulates a service that provides some data

public class StartExam {
    private String strLong = "999999999999999999";
    private String setReturnedStrLong = strLong;

    // Give strLong data to our program
    public String getStrInteger() {
        return strLong;
    }

    // Let us to give the changed strInteger data back safely without changing the initial code of the service
    public void setReturnedStrLong(String returnedStrLong) {
        this.setReturnedStrLong = returnedStrLong;
    }

    // Service applies our strLong change to it's own strInteger if it is valid for the service
    private void applyReturnedStrLong() {
        strLong = setReturnedStrLong;
    }

    // checks the task of StartExam. It should be strLong + 1
    // returns result of strLong like if applyReturnedStrLong() is used
    public String getReturnedStrInteger() {
        return setReturnedStrLong;
    }
}
