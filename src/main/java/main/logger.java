package main;

public class logger {
    public static logger send(String mes, int status){
        if (status == 1){
            System.out.println("[Alrose-Client | INFO] "+mes);
        }else if(status == 2){
            System.out.println("[Alrose-Client | WARN] "+mes);
        }else if(status == 3){
            System.out.println("[Alrose-Client | ERROR] "+mes);
        }else if(status == 0){
            System.out.println("[Alrose-Client | Log] "+mes);
        }
        return null;
    }
}
