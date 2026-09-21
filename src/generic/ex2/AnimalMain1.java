package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);    // 엄마생성자만들고 animal
        Dog dog = new Dog("김하늘",100);           // 자식생성자 dog 만들어서 이름,사이즈 부여
        Cat cat = new Cat("이보니", 50);

        Box<Dog> dogBox = new Box<>();                      // Dog타입의 Box 클래스의 dogBox를 만들어서
        dogBox.set(dog);                                    // dog를 set에 넣은다음
        Dog findDog = dogBox.get();                         // Dog타입의 findDog에 get메서드 호출해도 findDog은 그 강쥐가 출력된다.
        System.out.println("findDog = " + findDog);         // 1구짜리 상자와 같기때문에 또만들면 덮어쓰기가 된다.
                                                            // 만약 강쥐를 한마리 더하고싶다 하면 Box<Dog> pomebox = new Box<Dog>(); 하나 더생성해서
        Box<Cat> catBox = new Box<>();                      // pomebox.set(dog); 하고나서 Dog findDog = pomebox.get();을 하면됨
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
