import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {

        // test 1: let M1 propose first
        String[] mode1 = {"test","1"};
        AcceptRequest result = Paxos.start(mode1);

        // expect result to have final proposal number of 1, final proposal uid of 1, and final accepted value of 1
        if ((result.proposalID.getNumber() == 1) && (result.proposalID.getUID().equals("1")) && (result.proposedValue == 1)){
            System.out.println("test 1: success");
        } else {
            System.out.println("test 1: fail");
        }

        // test 2: let M2 propose first
        String[] mode2 = {"test","2"};
        result = Paxos.start(mode2);

        // expect result to have final proposal number of 1, final proposal uid of 2, and final accepted value of 2
        if ((result.proposalID.getNumber() == 1) && (result.proposalID.getUID().equals("2")) && (result.proposedValue == 2)){
            System.out.println("test 2: success");
        } else {
            System.out.println("test 2: fail");
        }

        // test 3: let M3 propose first
        String[] mode3 = {"test","3"};
        result = Paxos.start(mode3);

        // expect result to have final proposal number of 1, final proposal uid of 3, and final accepted value of 3
        if ((result.proposalID.getNumber() == 1) && (result.proposalID.getUID().equals("3")) && (result.proposedValue == 3)){
            System.out.println("test 3: success");
        } else {
            System.out.println("test 3: fail");
        }

        System.exit(0);
    }
}