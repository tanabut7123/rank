public class Range {
    private String input;

    public Range(String input) {
        this.input = input;
    }

    public String getOutput() {
        int first = getFirst();
        int second = getSecond();

        String output = "";
        for (int i = first; i <= second; i++) {
            output += i + ",";
        }
        return removeLastComma(output);
    }

    private int getSecond() {
        return Integer.parseInt(this.input.substring(3, 4));
    }

    private int getFirst() {
        return Integer.parseInt(this.input.substring(1, 2));
    }

    private String removeLastComma(String output) {
        return output.substring(0, output.length() - 1);
    }
}
