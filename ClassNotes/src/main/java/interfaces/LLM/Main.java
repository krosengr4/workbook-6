package interfaces.LLM;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        LlamaLLM llama = new LlamaLLM();

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your prompt: ");
        String userPrompt = myScanner.nextLine();

        String response = llama.sendPrompt(userPrompt);

        System.out.printf("Your prompt: %s\nLlama says: %s", userPrompt, response );

    }

}
