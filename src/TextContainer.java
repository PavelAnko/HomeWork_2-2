import java.io.*;

@SaveTo(path = "C:\\Users\\Legion\\Desktop\\IntelliJIDEA\\Pro\\HW-2-2\\text.txt")
public class TextContainer {
    private String text;
    public TextContainer(String text) {
        this.text = text;
    }
    @Saver
    public void save(String path) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(text);
        }
    }


}
