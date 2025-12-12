import java.util.Scanner;

public class _3_TextProcessorA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text");
        String text = scanner.nextLine();
        boolean flag = false;
        int position=0;
        for (int i=0; i<text.length();i++){
            char currentLetter = text.charAt(i);
            if(currentLetter=='A' || currentLetter=='a'){
                position = i+1;
                flag=true;
                //break when found letter A
                break;
            }
        }
        if(flag){
            System.out.println("Letter A found in position: "+position);
        }
        else{
            System.out.println("Letter A not found");
        }
        scanner.close();
    }
}
