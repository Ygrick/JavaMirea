package pr8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FilesApp {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Users\\Yrom\\IdeaProjects\\study\\src\\pr8\\1", false)) {
            // запись всей строки
            String text = "mfirfjr fgrtgjnt gm";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("C:\\Users\\Yrom\\IdeaProjects\\study\\src\\pr8\\1", true)) {
            // запись всей строки
            String text = "eeeeeeeeeeeeeeeeeeeeee";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("C:\\Users\\Yrom\\IdeaProjects\\study\\src\\pr8\\1")) {
            // читаемпосимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("C:\\Users\\Yrom\\IdeaProjects\\study\\src\\pr8\\1", false)) {
            // запись всей строки
            String text = "new file lol";
            writer.write(text);
            // запись по символам
            writer.append("Realy lol");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}