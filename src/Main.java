// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name="Simba";
        lion.family="Cats";
        lion.age=2;
        lion.isMammal=true;
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
            Animal dog = new Animal("Sou","Dogs",5,true);
        System.out.println(dog.name);

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        // (int i = 1; i <= 5; i++) {

            // Press Maj+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println(dog.isMammal);
        System.out.println(dog.age);
            Zoo myZoo= new Zoo("wildlife","Ariana");
        System.out.println(myZoo.name);
        //myZoo.displayZoo();
        System.out.println(dog.toString());
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(Zoo.nbrAnimals);

        System.out.println(myZoo.animals.length);
      // myZoo.DisplayAnimals();
       // System.out.println(myZoo.searchAnimal(dog));
        //System.out.println(myZoo.removeAnimal(dog));
        System.out.println("------verif tab-----");
        System.out.println(myZoo.isZooFull());
        Zoo myZoo2= new Zoo("frigia","tunis");
        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(lion);
        System.out.println(Zoo.nbrAnimals);
        System.out.println("------comparer tab-----");
        System.out.println(Zoo.comparerZoo(myZoo2,myZoo));




    }
    }
