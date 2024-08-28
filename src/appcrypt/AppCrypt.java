
package appcrypt;


public class AppCrypt {
    public static void main(String[] args){
        AppCrypt run = new AppCrypt();
        run.compila();
    }


    protected void compila() {
        WriteFile execWriteFile = new WriteFile();
        execWriteFile.runWrite();
    }
    
}
