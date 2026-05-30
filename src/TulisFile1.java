import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {
    public static void main(String[] args){
        var keyboard = new Scanner(System.in);
        System.out.println("Masukkan Teks yang akan disimpan: ");
        var text = keyboard.nextLine();
        /*Ketika parameter pada append diset true - maka akan ditulis diakhir dari file
        Ketika parameter pada append diset false - maka akan ditulis diawal file dan akan menimpa file yang ada di txt */
        try(var writer = new FileWriter("test.txt", true)){
            writer.write(text);
        }catch(IOException e){
            System.err.println("Gagal Menulis ke file");
        }

        keyboard.close();
    }
}
