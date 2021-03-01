import java.util.*;

public class Main {

    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(
        "Темнота.. Ваши глаза завязаны платком, а руки с ноги скованы веревками.. \n " +
        "Вы ничего не видите, но слышите, что кто-то громко руга.. *выстрел*, тишина..\n" +
        "'Ну чтож!.. Теперь разберемся с тобой..' - голос знакомый, вы где-то его уже слышали, *звук открытия ножа*\n" +
        "'Мы тебя давно искали, но даже не думали, что ты сам прийдешь к нам в руки!'. Повязка спала с ваших глаз, вы увидели.. нет.. только не он *мысли про себя*\n"+
        "'Узнал меня? - теперь этот голос кажется вам противным!\n" +
                "===============================КОНЕЦ ПРЕДЫСТОРИИ===============================\n"+
        "Добро пожаловать в игру! Управление - ввод комманд в чат; Автор сценария и программист - Карпушин Георгий;\n"+
                "Введте ваше имя: ");
        manager = new Character(in.next());
        story = new Story();
        System.out.println("=================================НАЧАЛО ИСТОРИИ================================");
        while (true) {
            manager.C += story.current_situation.dС;
            manager.K += story.current_situation.dK;
            manager.Rn += story.current_situation.dRn;
            System.out.println("=====\nКарьера:" + manager.K + "\tДенег:"
                    + manager.C + "\tРепутация (Нелегалы):" + manager.Rn + "\tРепутация (Законники):" + manager.Rz + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================КОНЕЦ!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

}


