package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);    // 엄마생성자만들고 animal
        Dog dog = new Dog("김하늘",100);           // 자식생성자 dog 만들어서 이름,사이즈 부여
        Cat cat = new Cat("이보니", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);         //자식타입은 부모타입에 담길수있다1
        animalBox.set(cat);         //자식타입은 부모타입에 담길수있다2

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);   // 출력: findAnimal = Animal{name='이보니', size=50} // 마지막에 넣은게 나오는것
    }
}
