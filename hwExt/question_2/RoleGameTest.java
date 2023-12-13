package hwExt.question_2;

public class RoleGameTest {

	public static void main(String[] args) {

		Hero saber = new CSwordMan("人類劍士'", 1, 0);
		saber.setAttackBehavior(new AttackSword());
		saber.setDefendBehavior(new DefendShield());
		saber.setMoveBehavior(new MoveRun());
		saber.attack();
		saber.defend();
		saber.move();

		Hero dragonArcher = new CDragonArcher("龍弓手", 1, 0);

		dragonArcher.setAttackBehavior(new AttackSword());
		dragonArcher.setMoveBehavior(new MoveFly());
		dragonArcher.attack();
		dragonArcher.defend();
		dragonArcher.move();

		Hero frogHero = new CCuteFrog("IamFrog", 1, 0);
		System.out.println(frogHero.name);
		frogHero.setAttackBehavior(new AttackFire());
		frogHero.setMoveBehavior(new MoveSwiming());
		frogHero.attack();
		frogHero.defend();
		frogHero.move();

	}

}
