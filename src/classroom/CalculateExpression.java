package classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateExpression {
    public static void main(String[] args) {
        String fileName = "exp.txt";
        String exp = readFile(fileName);
        assert exp != null;
        String data = exp+'='+calculate(exp);
        writeFile(fileName, data);
    }

    private static Double calculate(String exp) {
        int start = 0, end = 0;
        exp = exp.replaceAll("\\s+","");

        for(int i = 0; i < exp.length(); i++){
            if(exp.toCharArray()[i] == '('){
                start = i;
            }
            if(exp.toCharArray()[i] == ')'){
                end = i;
                return calculate(exp.substring(0, start) + symbolChange(exp.substring(start+1, end)) + exp.substring(end+1));
            }
        }

        Double calc = symbolChange(exp);
        if(calc == 0) return 0.0;
        return calc;
    }

    private static Double symbolChange(String exp) {
        Matcher m = Pattern.compile("-?[\\d.E]+").matcher(exp);
        List<Double> numbers = new ArrayList<>();
        while(m.find()) numbers.add(Double.parseDouble(m.group()));
        List<String> symbol = new ArrayList<>(Arrays.asList(exp.split("[\\d.E]+")));

        if(numbers.isEmpty()) throw new IllegalArgumentException("The <expression> is empty or invalid.");
        if (symbol.isEmpty()) return numbers.get(0);
        symbol.remove(0);

        for(int i = 0; i<symbol.size(); i++){
            if (symbol.get(i).equals("*")){
                numbers.set(i, numbers.get(i) * numbers.get(i+1));
                numbers.remove(i+1);
                symbol.remove(i);
                i--;
            }else if (symbol.get(i).equals(":") || symbol.get(i).equals("/")){
                if (numbers.get(i+1) == 0) throw new ArithmeticException(" / by zero.");
                numbers.set(i, numbers.get(i) / numbers.get(i+1));
                numbers.remove(i+1);
                symbol.remove(i);
                i--;
            }

        }

        for(int i = 0; i<symbol.size(); i++){
            if (symbol.get(i).equals("-") || symbol.get(i).equals("+") || symbol.get(i).equals("+-")){
                numbers.set(i, numbers.get(i) + numbers.get(i+1));
                numbers.remove(i+1);
                symbol.remove(i);
                i--;
            }else if (symbol.get(i).equals("--")){
                numbers.set(i, numbers.get(i) - numbers.get(i+1));
                numbers.remove(i+1);
                symbol.remove(i);
                i--;
            }
        }

        if (!symbol.isEmpty()) throw new IllegalArgumentException("The <expression> is invalid.");
        return numbers.get(0);
    }

    private static String readFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void writeFile(String fileName, String data) {
        try {
            Files.write(Paths.get(fileName), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
