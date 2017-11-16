import java.io.*;
public class question1{

	public void printTree(File folder, int n, BufferedWriter bw)throws IOException{

		for(int i = 0; i < n - 1; i++){
      bw.write("   |");
		}

		if(n != 0){
      bw.write("---");
		}

    bw.write(folder.getName());
    bw.newLine();



		File[] file = folder.listFiles();
		if(!folder.isDirectory() || file.length == 0){
			return;
		}

		for(int i = 0; i < file.length; i++){
      bw.write("|");
			printTree(file[i], n+1, bw);
		}


	}

	public static void main(String[] args)throws IOException{
    question1 q1 = new question1();
		File root = new File("/Users/gushuqin/Desktop/TEC");
    FileWriter fw = new FileWriter("dir_tree.txt");

    BufferedWriter bw = new BufferedWriter(fw);
		q1.printTree(root, 0, bw);

    bw.close();fw.close();

	}
}
