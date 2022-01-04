
public class keypad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String ans = solution(numbers, hand);
        System.out.println(ans);
    }

    private static String solution(int[] numbers, String hand) {
        StringBuilder answer=new StringBuilder();
        int lefthand=10;
        int righthand=12;
        for(int i:numbers){
            if(i==1||i==4||i==7){
                lefthand=i;
                answer.append("L");
            }else if(i==3||i==6||i==9){
                righthand=i;
                answer.append("R");
            }else{
                if(i==0)i+=11;
                int disl=(Math.abs(lefthand-i))/3+(Math.abs(lefthand-i))%3;
                int disr=(Math.abs(righthand-i))/3+(Math.abs(righthand-i))%3;

                if(disl==disr){
                    if(hand.equals("left")){
                        lefthand=i;
                        answer.append("L");
                    }else{
                        righthand=i;
                        answer.append("R");
                    }
                }else if(disl<disr){
                    answer.append("L");
                    lefthand=i;
                }else{
                    answer.append("R");
                    righthand=i;
                }
            }
        }
        return answer.toString();
    }
}
