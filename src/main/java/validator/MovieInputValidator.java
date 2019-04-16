package validator;

public class MovieInputValidator implements Validator {

    private String input;

    public MovieInputValidator(String input) {
        this.input = input;
    }

    @Override
    public boolean doesValid() {
        return doesInputIsNumeric() && doesInputIsNotNull();
    }

    private boolean doesInputIsNumeric() {
        return input.matches("[0-9]+");
    }

    private boolean doesInputIsNotNull() {
        return input != null;
    }
}
