package appcrypt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteFile {
    private File varFileAbsolute(){
        //Create file
        final String DIR_FILE = "GENE-PASS/DB-USERS";
        final String FILE_NAME = "chpasswd-file.txt";
        String dirProject = System.getProperty("user.dir");
        File fileAbsolute = new File(dirProject+File.separator+DIR_FILE+File.separator+FILE_NAME);
        try {
            fileAbsolute.createNewFile();
        } catch (Exception io) {
            System.out.println("Error al crear el archivo");
        }
        return fileAbsolute ;
    }

    protected void runWrite(){
        GenString genString = new GenString();
        Byte caracteres = 16;
        String userUnix = "cnode";
        String separadorFile = ":";

        try {
            FileOutputStream fos = new FileOutputStream( varFileAbsolute() );
            PrintStream filePrintWrite = new PrintStream( varFileAbsolute() );
            filePrintWrite.println( userUnix + separadorFile + 
                genString.genString(caracteres) );
            filePrintWrite.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    } 
}
