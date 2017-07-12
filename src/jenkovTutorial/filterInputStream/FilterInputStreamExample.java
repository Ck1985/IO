package jenkovTutorial.filterInputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FilterInputStreamExample extends FilterInputStream{
    public FilterInputStreamExample(InputStream input) {
        super(input);
    }
    public static void main(String[] args) throws IOException {
        FilterInputStream input = new FilterInputStreamExample(new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\characteroutput.txt"));
    }
}
