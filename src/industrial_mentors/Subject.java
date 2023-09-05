package industrial_mentors;

class Subject {
        Topic t = new Topic();
        public void startReading(){
            t.understand();
        }
}
class Topic {
    public void understand() {
        System.out.println("Tight coupling concept");
    }
}
class MainClassCupling{
    public static void main(String[] args) {
        Subject s=new Subject();
        s.startReading();
    }
}