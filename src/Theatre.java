import java.util.ArrayList;
import java.util.Scanner;

public class Theatre {
    public static final ArrayList<Show> shows = new ArrayList<>();
    public static Actor actor1;
    public static Actor actor2;
    public static Actor actor3;
    public  static Director director1;
    public static Director director2;
    public static ArrayList<Actor> actorsForMusicalShow;
    public static ArrayList<Actor> actorsForBallet;
    public static ArrayList<Actor> actorsForOpera;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showMustGoOn();

        while (true) {
            printMenu();
            int cmd = scanner.nextInt();

            switch (cmd) {
                case 1:
                printLibretto();
                int cmdLibretto = scanner.nextInt();
                if (cmdLibretto == 1) {
                    System.out.println(Ballet.printLibrettoForBallet());
                    System.out.println();
                } else if (cmdLibretto == 2) {
                    System.out.println(Opera.printLibrettoForOpera());
                    System.out.println();
                } else if (cmdLibretto == 3) {
                    System.out.println("Спасибо за  интерес к нашим постановкам! Всего доброго!");
                } break;
                case 2:
                printInfoAboutDirector();
                int cmdDirector = scanner.nextInt();
                if (cmdDirector == 1) {
                    System.out.println(director1);
                    System.out.println();
                } else if (cmdDirector == 2) {
                    System.out.println(director2);
                    System.out.println();
                } else if (cmdDirector == 3) {
                    System.out.println("Следите за пополнением нашего штата. До новых встреч!");
                } break;
                case 3:
                //печать списка актеров
                printListOfActors();
                int cmdListOfActors = scanner.nextInt();
                if (cmdListOfActors == 1 ) {
                    System.out.println(actorsForMusicalShow);
                    System.out.println();
                } else if (cmdListOfActors == 2) {
                    System.out.println(actorsForBallet);
                    System.out.println();
                } else if (cmdListOfActors == 3) {
                    System.out.println(actorsForOpera);
                    System.out.println();
                } else if (cmdListOfActors == 4) {
                    System.out.println("Спасибо за интерес к нашим постановкам. Всего доброго!");
                } break;
                case 4:
                //добавление нового актера
                addNewActor();
                int cmdAddNewActor = scanner.nextInt();
                if (cmdAddNewActor == 1) {
                    scanner.nextLine();
                    System.out.println("Введите имя актера, которого Вы хотите добавить");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию актера, которого Вы хотите добавить");
                    String surname = scanner.nextLine();
                    System.out.println("Введите рост актера, которого Вы хотите добавить");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    Person.Gender gender;
                    while (true) {
                        System.out.print("Введите пол (MALE/FEMALE): ");
                        String genderInput = scanner.nextLine().toUpperCase();
                        try {
                            gender = Person.Gender.valueOf(genderInput);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Ошибка! Введите MALE или FEMALE");
                        }
                    }
                    Actor newActor = new Actor(name, gender, surname, height);
                    if (newActor.equals(actor1) || newActor.equals(actor2)) {
                        System.out.println("Такой актер уже задействован в постановке.");
                    } else {
                        actorsForMusicalShow.add(newActor);
                    }
                } else if (cmdAddNewActor == 2) {
                    scanner.nextLine();
                    System.out.println("Введите имя актера, которого Вы хотите добавить");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию актера, которого Вы хотите добавить");
                    String surname = scanner.nextLine();
                    System.out.println("Введите рост актера, которого Вы хотите добавить");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    Person.Gender gender;
                    while (true) {
                        System.out.print("Введите пол (MALE/FEMALE): ");
                        String genderInput = scanner.nextLine().toUpperCase();
                        try {
                            gender = Person.Gender.valueOf(genderInput);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Ошибка! Введите MALE или FEMALE");
                        }
                    }
                    Actor newActor = new Actor(name, gender, surname, height);
                    if (newActor.equals(actor1) || newActor.equals(actor3)) {
                        System.out.println("Такой актер уже задействован в постановке.");
                    } else {
                        actorsForBallet.add(newActor);
                    }
                } else if (cmdAddNewActor == 3) {
                    scanner.nextLine();
                    System.out.println("Введите имя актера, которого Вы хотите добавить");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию актера, которого Вы хотите добавить");
                    String surname = scanner.nextLine();
                    System.out.println("Введите рост актера, которого Вы хотите добавить");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    Person.Gender gender;
                    while (true) {
                        System.out.print("Введите пол актера (MALE/FEMALE): ");
                        String genderInput = scanner.nextLine().toUpperCase();
                        try {
                            gender = Person.Gender.valueOf(genderInput);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Ошибка! Введите MALE или FEMALE");
                        }
                    }
                    Actor newActor = new Actor(name, gender, surname, height);
                    if (newActor.equals(actor1) || newActor.equals(actor2) || newActor.equals(actor3)) {
                        System.out.println("Такой актер уже задействован в постановке.");
                    } else {
                        actorsForOpera.add(newActor);
                    }
                } else if (cmdAddNewActor == 4) {
                    System.out.println("Всего доброго!");
                } break;
                case 5:
                //замена актера на другого
                changeActor();
                int cmdChangeActor = scanner.nextInt();
                scanner.nextLine();

                if (cmdChangeActor == 1) {
                    System.out.println("Список актеров выбранного Вами спектакля: ");
                    System.out.println();
                    for (int i = 0; i < actorsForMusicalShow.size(); i++) {
                        System.out.println((i+1) + ". " + actorsForMusicalShow.get(i));
                    }
                    System.out.println("Введите номер актера для замены: ");
                    int actorNumber = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (actorNumber >= 0 && actorNumber < actorsForMusicalShow.size()) {
                        System.out.println("В постановке будет заменен актер: " + actorsForMusicalShow.get(actorNumber));
                        System.out.println();
                    }
                    System.out.println("Введите имя актера, на которого Вы хотите заменить");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию актера, на которого Вы хотите заменить");
                    String surname = scanner.nextLine();
                    System.out.println("Введите рост актера, на которого вы хотите заменить");
                    int height = scanner.nextInt();
                    scanner.nextLine();

                    Actor newActor = new Actor(name, null, surname, height);
                    Actor previousActor = actorsForMusicalShow.set(actorNumber, newActor);

                    System.out.println("Вы заменили " + previousActor + " на " + newActor);
                    System.out.println();
                    System.out.println("Новый список актеров: " + actorsForMusicalShow);

                } else if (cmdChangeActor == 2) {
                    System.out.println("Список актеров выбранного Вами спектакля: ");
                    System.out.println();
                    for (int i = 0; i < actorsForBallet.size(); i++) {
                        System.out.println((i+1) + ". " + actorsForBallet.get(i));
                    }
                    System.out.println("Введите номер актера для замены: ");
                    int actorNumber = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (actorNumber >= 0 && actorNumber < actorsForBallet.size()) {
                        System.out.println("В постановке будет заменен актер: " + actorsForBallet.get(actorNumber));
                        System.out.println();
                    }
                    System.out.println("Введите имя актера, на которого Вы хотите заменить");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию актера, на которого Вы хотите заменить");
                    String surname = scanner.nextLine();
                    System.out.println("Введите рост актера, на которого вы хотите заменить");
                    int height = scanner.nextInt();
                    scanner.nextLine();

                    Actor newActorInBallet = new Actor(name, null, surname, height);
                    Actor previousActorInBallet = actorsForBallet.set(actorNumber, newActorInBallet);

                    System.out.println("Вы заменили " + previousActorInBallet + " на " + newActorInBallet);
                    System.out.println();
                    System.out.println("Новый список актеров: " + actorsForBallet);

                } else if (cmdChangeActor == 3) {
                System.out.println("Список актеров выбранного Вами спектакля: ");
                System.out.println();
                for (int i = 0; i < actorsForOpera.size(); i++) {
                    System.out.println((i+1) + ". " + actorsForOpera.get(i));
                }
                System.out.println("Введите номер актера для замены: ");
                int actorNumber = scanner.nextInt() - 1;
                scanner.nextLine();

                if (actorNumber >= 0 && actorNumber < actorsForOpera.size()) {
                    System.out.println("В постановке будет заменен актер: " + actorsForOpera.get(actorNumber));
                    System.out.println();
                }
                System.out.println("Введите имя актера, на которого Вы хотите заменить");
                String name = scanner.nextLine();
                System.out.println("Введите фамилию актера, на которого Вы хотите заменить");
                String surname = scanner.nextLine();
                System.out.println("Введите рост актера, на которого вы хотите заменить");
                int height = scanner.nextInt();
                scanner.nextLine();

                Actor newActorInOpera = new Actor(name, null, surname, height);
                Actor previousActorInOpera = actorsForOpera.set(actorNumber, newActorInOpera);

                System.out.println("Вы заменили " + previousActorInOpera + " на " + newActorInOpera);
                System.out.println();
                System.out.println("Новый список актеров: " + actorsForOpera);

                } else if (cmdChangeActor == 4) {
                    System.out.println("Всего доброго!");
                } break;

                case 0:
                System.out.println("Всего доброго! С нетерпением ждем Вашей следующей встречи с прекрасным!");
                return;
                default:
                System.out.println("Извините, такую команду мы еше не придумали.");
                System.out.println();
                break;
            }


        }
    }


        public static void showMustGoOn () {

             actor1 = new Actor("Ольга", Person.Gender.FEMALE, "Иванова", 168);
             actor2 = new Actor("Станислав", Person.Gender.MALE, "Здорик", 183);
             actor3 = new Actor("Эрика", Person.Gender.FEMALE, "Курта", 175);

            director1 = new Director("Фрида", Person.Gender.FEMALE, "Нейзер", 9);
            director2 = new Director("Никита", Person.Gender.MALE, "Куруджи", 7);

            actorsForMusicalShow = new ArrayList<>();
            actorsForMusicalShow.add(actor1);
            actorsForMusicalShow.add(actor2);

            MusicalShow musicalShow = new MusicalShow("Анна Каренина", actorsForMusicalShow, director1,
                    120,
                    "Сергей Васильевич Рахманинов");
            shows.add(musicalShow);

            actorsForBallet = new ArrayList<>();
            actorsForBallet.add(actor1);
            actorsForBallet.add(actor3);

            Ballet ballet = new Ballet("Лебединное озеро", actorsForBallet, director1,
                    95,
                    "Петр Ильич Чайковский",
                    "Либретто балета 'Лебединое озеро'",
                    "Мариус Петипа");
            shows.add(ballet);

            actorsForOpera = new ArrayList<>();
            actorsForOpera.add(actor1);
            actorsForOpera.add(actor2);
            actorsForOpera.add(actor3);

            Opera opera = new Opera("Пер Гюнт", actorsForOpera, director2, 125,
                    "Эдвард Григ",
                    "Либретто оперы 'Пер Гюнт'",
                    23);
            shows.add(opera);
        }

         static void printMenu () {
            System.out.println("Что Вы хотите сделать?");
            System.out.println("1 - Напечатать текст либретто.");
            System.out.println("2 - Узнать  информацию о режиссере.");
            System.out.println("3 - Напечатать список всех актеров постановки.");
            System.out.println("4 - Добавить нового актера.");
            System.out.println("5 - Заменить одного из актеров.");
            System.out.println("0 - Выйти");

            System.out.println("~".repeat(10));
        }

        static void printLibretto() {
            System.out.println("Либреттно к какой постановке Вы хотите увидеть?");
            System.out.println("1 - Балет Лебидиное озеро");
            System.out.println("2 - Опера Пер Гюнт");
            System.out.println("3 - Выйти");

            System.out.println("~".repeat(10));
        }

        static void printInfoAboutDirector() {
            System.out.println("Информацию о каком режиссере вы хотите получить?");
            System.out.println("1 - Фрида Нейзер");
            System.out.println("2 - Никита Куруджи");
            System.out.println("3 - Выйти");

            System.out.println("~".repeat(10));
        }

        static void printListOfActors() {
            System.out.println("Список актеров какой постановки Вы хотели бы увидеть?");
            System.out.println("1 - Анна Каренина");
            System.out.println("2 - Лебидиное озеро");
            System.out.println("3 - Пер Гюнт");
            System.out.println("4 - Выйти");

            System.out.println("~".repeat(10));
        }

        static void addNewActor() {
            System.out.println("В какой спектакль Вы хотели бы добавить актера?");
            System.out.println("1 - Анна Каренина");
            System.out.println("2 - Лебидиное озеро");
            System.out.println("3 - Пер Гюнт");
            System.out.println("4 - Выйти");

            System.out.println("~".repeat(10));
        }

        static void changeActor() {
            System.out.println("В каком спектакле вы хотели бы заменить актера?");
            System.out.println("1 - Анна Каренина");
            System.out.println("2 - Лебидиное озеро");
            System.out.println("3 - Пер Гюнт");
            System.out.println("4 - Выйти");

            System.out.println("~".repeat(10));
        }
    }

