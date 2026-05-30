import java.io.File;
import java.io.IOException;

public class ShowListFile {
    public static void main(String[] args) throws IOException {
        var folder = new File("D:\\KULIAH\\Semester 2\\Pemrograman Lanjut\\Praktikum\\Modul10\\src");

        File[] listFiles = folder.listFiles();

        if (listFiles != null && listFiles.length > 0) {
            if (folder.exists()) {
                for (File i : listFiles) {
                    System.out.println("File : " + i.getName());
                }
            } else {
                System.out.println("Folder tidak bisa dibuka");
            }
        }

    }
}
