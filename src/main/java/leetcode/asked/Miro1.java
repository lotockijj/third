package leetcode.asked;

//https://www.talent.micro1.ai/login
public class Miro1 {

    private Miro1() {}

    public static int solution(int[] boxes, int[] checkpoints){
        int result = 0;
        for (int i = checkpoints[0], j = 0; i < checkpoints.length - 1; i++, j++) {
            if(j < checkpoints.length - 1) {
                int tempResult = boxes[checkpoints[j]] - boxes[checkpoints[j + 1]];
                result = Math.max(result, Math.abs(tempResult));
            }
        }
        return result;
    }
}
