import java.util.HashMap;

public class HashMapJavaTraining {
    static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("MATH",75);
        examScores.put("Science",65);
        examScores.put("English",56);
        examScores.put("Algebra",99);
        examScores.put("JAVA",100);

        examScores.putIfAbsent("Ecology", 58);
        examScores.replace("JAVA", 68);

        System.out.println(examScores.toString());
        System.out.println(examScores.get("English"));
    }
}
