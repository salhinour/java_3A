public class Zoo {

    Animal[] animals = new Animal[25];//initialisation et declaration
    String family;
    String name;
    String city;
    final int NBR_CAGES = 25; //avec final constante ne change pas
    int NbrAnimal = 0;
    static int nbrAnimals = 0;

    Zoo() {
        animals = new Animal[NBR_CAGES];
    }

    Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];

    }

    void displayZoo() {
        System.out.println("myZoo :");
        System.out.println("name :" + name + ",city :" + city + ",n° cages:" + NBR_CAGES);
    }

    public String toString() {
        return "name :" + name + ",city :" + city + ",n° cages:" + NBR_CAGES;
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if (NbrAnimal < NBR_CAGES) {
            animals[NbrAnimal] = animal;//a chaque fois ajouter un  animal a animals
            NbrAnimal++;
            return true;
        } else
            return false;
    }


    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < NbrAnimal; i++) {
            animals[i] = animals[i + 1];
        }
        animals[NbrAnimal] = null;
        NbrAnimal--;
        return true;
    }

    void DisplayAnimals() {
        System.out.println("my zoo :" + name + "has");
        for (int i = 0; i < NbrAnimal; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < NbrAnimal; i++) {
            if (animals[i].name == animal.name) {
                return i;
            } else
                return index;
        }

        return index;
    }

    // prosit 3 inst 15
    boolean isZooFull() {
        //return !(animals[animals.length-1]==null); //elle commence de 0
        return NbrAnimal == NBR_CAGES;
    }

    // inst 16
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.NbrAnimal > z2.NbrAnimal) {
            return z1;
        } else if (z2.NbrAnimal > z1.NbrAnimal)
            return z2;
        else {
            System.out.println("le nombre des animaux dans les deux zoo egaux");
           return z2;
        }
    }
}

