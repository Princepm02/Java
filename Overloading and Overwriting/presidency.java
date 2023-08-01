import java.util.*;

class cse {
    void intake(String branch) {
        if (branch.equals("cse"))
            System.out.println("1500 intake");
    }
}

class ece extends cse {
    void intake(String branch) {
        if (branch.equals("ece"))
            System.out.println("689 intake");
    }
}

class mec extends ece {
    void intake(String branch) {
        if (branch.equals("mec"))
            System.out.println("669 intake");
    }
}

public class presidency {
    public static void main(String[] args) {
        //cse c = new mec();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the branch : ");
        String branch = sc.next();
        cse c = new cse();
        c.intake(branch);
    }
}
