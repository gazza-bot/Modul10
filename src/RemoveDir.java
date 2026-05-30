import java.io.File;
import java.util.Scanner;

public class RemoveDir {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var path = input.nextLine();
        var folderTest = new File(path);

        File files[] = folderTest.listFiles();

        if(folderTest.exists()){
            // cek file apakah ada isinya atau tidak
            if(files != null && files.length > 0){
                for(File i : files){
                    boolean isBerhasil = i.delete();
                    if(isBerhasil){
                        System.out.println(i.getName() + " Berhasil dihapus");
                    }else {
                        System.out.println(i.getName() + " Gagal dihapus");
                    }
                }
            }   
            // delete direktori
            if (folderTest.delete()){   
                System.out.println("Direktori " + folderTest.getName() + " Berhasil Dihapus");
            }else{
                System.out.println("Direktori " + folderTest.getName() + " Gagal Dihapus");
            }
        }else{
            System.out.println("Direktori tidak ditemukan");
        }

        input.close();
    }
}
