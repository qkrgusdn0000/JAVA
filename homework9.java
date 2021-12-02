import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

class Homework9 {
    public static void main(String[] args) {
        HashMap<String,String> db =new HashMap<String,String>();
        try {
            Scanner sc = new Scanner(new File("db.txt"));
            while (sc.hasNext()) {
                String id = sc.next();
                String password = sc.next();
                db.put(id,password);
            }
            sc.close();
        }
        catch (Exception e) { e.printStackTrace(); }

        System.out.println("id와 password를 입력해주세요");
        System.out.printf("id:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        if (db.containsKey(id)){
            System.out.printf("password:");
            Scanner scanner1 = new Scanner(System.in);
            String pw = scanner.next().trim();
            System.out.printf("%s %s", db.get(id), pw);
            if(db.get(id).equals(pw)){
                System.out.println("id와 비밀번호가 일치합니다");
            }
            else System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
        }
        else System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
    }
}
