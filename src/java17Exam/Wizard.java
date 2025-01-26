package java17Exam;

public class Wizard {
    record Spell(String cast) {}
    public static void main(String[] args) {
        Spell[] spells = {
                new Spell("Bibbidi-Bobbidi-Boo"),
                new Spell("Abracadabra")
        };
        class Duel {
            void fight() {
                for (Spell spell : spells) {
                    System.out.println(spell.cast());
                }
            }
        }
        Duel duel = new Duel();
        duel.fight();
    }
}
