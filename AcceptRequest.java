public class AcceptRequest {
    ProposalID proposalID;
    int proposedValue;

    AcceptRequest(ProposalID proposalID, int proposedValue) {
        this.proposalID = proposalID;
        this.proposedValue = proposedValue;
    }
}