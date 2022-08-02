import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
        String[] studentName = {"Osama","Rahma","Ibrahim","Ismail"};
        int[] studentScore= {95,80,99,85};//respectively
        //required sort decreasing, print respectively osama 95 ...
        BubleSort(studentName,studentScore);
        System.out.println(Arrays.toString(studentName));
        System.out.println(Arrays.toString(studentScore));
    }

    private static void BubleSort(String[] studentName, int[] studentScore) {
        for (int j =0;j<studentScore.length-1;j++){
            for (int i = 0; i<studentScore.length-1;i++){
                if (studentScore[i]<studentScore[i+1]){
                    int temp = studentScore[i];
                    String tempString = studentName[i];

                    studentScore[i] = studentScore[i+1];
                    studentName[i] = studentName[i+1];

                    studentScore[i+1] = temp;
                    studentName[i+1] = tempString;
                }
            }
        }

    }
}
