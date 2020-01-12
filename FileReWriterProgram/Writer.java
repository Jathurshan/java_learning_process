import java.io.FileWriter;
import java.io.BufferedWriter;

public class Writer{
	
	public static void main (String [] args) throws Exception{
		
		Writer writer = new Writer();
		
		String filePath = "inputFile.txt";
		String sentence = "I am Iron-Man....!!";
		writer.fileWriter(filePath, sentence);
	}
	
	public void fileWriter(String path , String sentence) throws Exception{
		FileWriter fileWriter = new FileWriter(path);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(sentence);
		System.out.println("Your input message is: " + sentence);
		System.out.println();
		System.out.println("Successfully Written...");
		bufferedWriter.close();
	}
}