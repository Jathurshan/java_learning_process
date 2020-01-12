import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ReWriter extends Writer{
	public static void main(String [] args) throws Exception{
		
		ReWriter reader = new ReWriter();
		Writer writer = new ReWriter();
		
		String filePath = "inputFile.txt";
		String sentence = reader.fileReader(filePath);
		writer.fileWriter(filePath, sentence);
	}
	
	public String fileReader(String path) throws Exception{
		
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		int i;
		String sentence = "";
		
		while((i = bufferedReader.read())!= -1){
			if(i >= 97 && i <= 122){
				i = i - 32;
			}
			//System.out.print((char)i);
			sentence = sentence + (char)i;
		}
		return sentence;
	}
	
	public void fileWriter(String path, String sentence) throws Exception{
		
		//new Writer().fileWriter(path, sentence);
		
		FileWriter fileWriter = new FileWriter(path);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		System.out.println("Output: " + sentence);
		bufferedWriter.write(sentence);
		System.out.println("Successfully Updated...");
		bufferedWriter.close();
	}
}