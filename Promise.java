public class Promise {
    String acceptorUID;
    ProposalID proposalID;
    ProposalID previousID;
    int acceptedValue;

    Promise(String acceptorUID, ProposalID proposalID, ProposalID previousID, int acceptedValue) {
        this.acceptorUID = acceptorUID;
        this.proposalID = proposalID;
        this.previousID = previousID;
        this.acceptedValue = acceptedValue;
    }
}