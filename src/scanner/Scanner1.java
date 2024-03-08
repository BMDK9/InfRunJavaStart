package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Line = String
        String strSc = sc.nextLine();
        String strBr = br.readLine();
        System.out.println("strSc = " + strSc);
        System.out.println("strBr = " + strBr);

        // br은 String 만 있음
        int intSc = sc.nextInt();
        System.out.println("intSc = " + intSc);
    }
}
