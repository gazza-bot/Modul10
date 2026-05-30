import java.io.File;
import java.util.Scanner;

public class CheckSize {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var path = input.nextLine();
        var fileName = path;
        var file = new File(fileName);
        
        if(file.exists()){
            var ukuranByte = file.length();

            var ukuranKB = ukuranByte / 1024;
            var ukuranMB = ukuranKB / 1024;

            if(ukuranMB < 1){
                System.out.printf("Ukuran File: %,d KB", ukuranKB );
            }else if(ukuranMB >= 1){
                System.out.printf("Ukuran File: %d MB", ukuranMB);
            }
        }

        input.close();
    }
}
