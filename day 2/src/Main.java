import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String opcode = new Scanner(new File("src/input.txt")).next();
        String[] codes = opcode.split(",");
        int[] ops = new int[codes.length];

        // Make opcodes into an array of ints
        for (int i = 0; i < codes.length; i++) {
            ops[i] = Integer.parseInt(codes[i]);
        }


        // Set required values
        ops[1] = 12;
        ops[2] = 2;
        
        for (int i = 0; i < ops.length; i += 4) {
            if (ops[i] == 1) {
                ops[ops[i + 3]] = ops[ops[i + 1]] + ops[ops[i + 2]];
            } else if (ops[i] == 2) {
                ops[ops[i + 3]] = ops[ops[i + 1]] * ops[ops[i + 2]];
            } else {
                break;
            }
        }

        System.out.println(ops[0]);
    }
}
