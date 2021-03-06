package StudentGrade;

public class StudentInfo {
    private int CodeNumber;
    private String Name;
    private String Major;
    private int PhoneNumber;


    public StudentInfo(int CodeNumber, String Name, String Major, int PhoneNumber) {
        super();
        this.CodeNumber = CodeNumber;
        this.Name = Name;
        this.Major = Major;
        this.PhoneNumber = PhoneNumber;
    }

    public int CodeNumber() {
        return CodeNumber;
    }

    public String Name() {
        return Name;
    }

    public String Major() {
        return Major;
    }

    public int PhoneNumber() {
        return PhoneNumber;
    }


    @Override
    public String JoinStudent() {
        return "입력된 학생의 정보는 다음과 같습니다: " + CodeNumber + Name + Major + PhoneNumber;
    }
}

package StudentSystem;

        import java.util.Scanner;

public class StudentSystem {

}
    public static void main(String[] args) {

        StudentSystem sm = new StudentSystem();

        System.out.println("학생관리 프로그램");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.학생 입력  2.조회  3.종료 >> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                if (sm.isCanAddStudent()) {
                    System.out.print("학번 : ");
                    int CodeNumber = sc.nextInt();
                    System.out.print("이름 : ");
                    String Name = sc.next();
                    System.out.print("전공 : ");
                    String Major = sc.next();
                    System.out.print("전화번호 : ");
                    int PhoneNumber = sc.nextInt();

                    sm.addStudent(CodeNumber, Name, Major, PhoneNumber);
                } else {
                    System.out.println("다시 눌러주세요");
                }
            } else if (choice == 2) {
                StudentInfo[] stuList = sm.getStuList();
                for (int i = 0; i < sm.getIndex(); i++) {
                    System.out.println((i + 1) + "번 학생 >> " + stuList[i]);
                    // System.out.println("\t 학번 \t 이름 \t 전공 \t 전화번호");
                    // System.out.println(stuList[i].getCodeNumber() + " \t " + stuList[i].getName()
                    // + " \t "
                    // + stuList[i].getMajor() + " \t\t " + stuList[i].getPhoneNumber());
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        }
    }

