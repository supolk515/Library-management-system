package Sport;

public class Test {
    public void main(String[] args){
        tabletennisTeacher t1 = new tabletennisTeacher("zhangsan",20);
        System.out.println(t1.getName() + " " + t1.getAge());
        t1.speakEnglish();
        t1.teach();
    }
}
