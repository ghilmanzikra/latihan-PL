import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String namaFile = "D:\\latihan intellij\\latihan\\src\\1000 Data Fix .csv";

        List<Ghilman> guy = new ArrayList<>();

        try  {
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                Ghilman aji = new Ghilman();
                aji.no  = Integer.parseInt(row[0]);
                aji.nama = row[1];
                aji.prodi = row[2];
                aji.jeniskelamin = row[3];

                guy.add(aji);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        for (Ghilman aj : guy) {
            System.out.println(aj.no);
        }
    }
}
