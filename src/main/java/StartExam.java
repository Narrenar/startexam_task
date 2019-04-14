// Emulates a service that provides some data

public class StartExam {
    private String numberAsString = "99999999999999999999999999999999999999999999999999999999999999999999999999999999" +
            "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
    private String returnedNumberAsString = "";

    // Give numberAsString data to our program
    public String getNumberAsString() {
        return numberAsString;
    }

    // Let us give the changed numberAsString data back safely without changing the initial numberAsString of the service
    public void setNumberAsString(String returnedNumberAsString) {
        this.returnedNumberAsString = returnedNumberAsString;
    }

    // Service applies our returnedNumberAsString to it's own numberAsString if it is valid for the service:
    /*private void applySetReturnedNumberAsString() {
        numberAsString = returnedNumberAsString;
    }*/

    // checks the task of StartExam. It should be numberAsString + 1 or throw an error
    public String getReturnedNumberAsString() {
        return returnedNumberAsString;
    }
}
