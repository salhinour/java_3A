public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    /*constructeur*/
    public Animal(){}
    public Animal(String family ,String name ,int age , boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public String toString(){
        return  "Family :" +family+ ",Name :" +name+ ",Age:" +age+",IsMammel:" +isMammal;
    }
}
