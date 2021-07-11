package server;

public class Logger {
    public Logger(int level, String thread_name, String message){
        if(level == 0){
            System.out.println("[Alrose-Server|"+thread_name+"|Trace] "+message);
        }else if(level == 1){
            System.out.println("[Alrose-Server|"+thread_name+"|Debug] "+message);
        }else if(level == 2){
            System.out.println("[Alrose-Server|"+thread_name+"|Info] "+message);
        }else if(level == 3){
            System.out.println("[Alrose-Server|"+thread_name+"|Warn] "+message);
        }else if(level == 4){
            System.out.println("[Alrose-Server|"+thread_name+"|Error] "+message);
        }else if(level == 5){
            System.out.println("[Alrose-Server|"+thread_name+"|Fatal] "+message);
        }
    }
}
