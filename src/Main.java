//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name);
        Hero h2 = new Hero();
        System.out.println(h2.name);
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);    // ミナトを回復させる（HP: 100 -> 110）
        w.heal(h2);    // アサカを回復させる（HP: 100 -> 110）
        w.heal(h2);    // アサカを回復させる（HP: 110 -> 120）
    }
}