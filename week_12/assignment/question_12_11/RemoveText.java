package week_12.assignment.question_12_11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Question_12_11 John filename");
            System.exit(1);
        }
        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println(args[1] + " does not exist");
            System.exit(2);
        }
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[0], "");
                list.add(s2);
            }
            input.close();

            PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < list.size(); i++) {

                output.println(list.get(i));

            }
            output.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}