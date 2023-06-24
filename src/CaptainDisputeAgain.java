public class CaptainDisputeAgain {
    public int findMin(int[] triple){
        return triple[0] < triple[1]? triple[0]:
                triple[1] < triple[2]? triple[1]:
                        triple[2] < triple[0]? triple[2]: triple[0];
    }
}
