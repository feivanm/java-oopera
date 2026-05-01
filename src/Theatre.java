import people.Actor;
import people.Director;
import people.Gender;
import people.Person;
import perfomances.Ballet;
import perfomances.Opera;
import perfomances.Show;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");
// генерируем актеров режисера и автра музыки хреографа
        Actor actor1 = new Actor("Григорий", "Любавин", 180, Gender.MALE);
        Actor actor2 = new Actor("Андрей", "Рублев", 185, Gender.MALE);
        Actor actor3 = new Actor("Анна", "Ворошилова", 165, Gender.FEMALE);
        Actor actor4 = new Actor("Андрей", "Любавин", 180, Gender.MALE);
        Director director1 = new Director("Стивен", "Спилберг", 170, Gender.MALE, 10);
        Director director2 = new Director("Алексей", "Балабанов", 170, Gender.MALE, 15);
        Person musicAuthor = new Person("Андрей", "Губин", 163, Gender.MALE);
        Person choreographer = new Person("Андрей", "Губин", 163, Gender.MALE);
// Создаем спеткаль обычный и добавляем актеров через список
        ArrayList<Actor> showActors = new ArrayList<>(List.of(actor1, actor2));
        Show show = new Show("Вечерний час", 120, director2, showActors);
// Создаем оперу и добавляем актеров
        Opera opera = new Opera("Песнь викинга", 120, director1, musicAuthor, "либрето хз что это", 10);
        //opera.addActor(actor4);
        opera.addActor(actor3);
        opera.addActor(actor1);

        // Создаем балет и добавляем в него актеров
        Ballet ballet = new Ballet("Танец стрекозы", 120, director2, musicAuthor, "либрето хз что это 2 ", choreographer);
        ballet.addActor(actor2);
        ballet.addActor(new Actor("Николай", "Цискоридзе", 186, Gender.MALE));

        // Для каждого спектакля выведите на экран список актёров.
        show.printActors();
        opera.printActors();
        ballet.printActors();
        // Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        show.changeActor(new Actor("Егор", "Денисов", 150, Gender.MALE), "Рублев");
        show.printActors();
        // Попробуйте заменить в другом спектакле несуществующего актёра
        opera.changeActor(actor2,"Изгибин");
        // Попытка заменить существующего актера в тот же спектакль
        opera.changeActor(actor1,"Любавин");
        // Попытка заменить актера однофамильца в спектакле. Вообще ТЗ дурацкое, некорректно искать существующего актера по фамилии.
        opera.changeActor(actor4,"Любавин");

        opera.printActors();
        //Вывод режисера дл спектакля
        show.printDirector();

        //Для оперного и балетного спектакля выведите на экран текст либретто.
        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}
