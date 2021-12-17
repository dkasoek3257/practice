import java.util.*;
class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // 정렬 기준은 '점수가 낮은 순서'
    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}
public class _4_2_ScoreStudent {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("학생의 수 N: ");
        List<Student>students=new ArrayList<>();
        int N=sc.nextInt();
        for(int i=0; i<N; i++){
            String name=sc.next();
            int score=sc.nextInt();
            students.add(new Student(name,score));
        }

        Collections.sort(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }
    }
}
// 4-2 정렬 다시 하기