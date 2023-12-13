package hwExt.question_2;

public abstract class Hero {
	// 省略 getter/setter...

	protected String name;
	protected int level;
	protected double exp;

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
		setDefaultBehavior();
	}

	private IAttackBehavior attackBehavior;
	private IDefendBehavior defendBehavior;
	private IMoveBehavior moveBehavior;

	private void setDefaultBehavior() {
		this.attackBehavior = new AttackSword();
		this.defendBehavior = new DefendShield();
		this.moveBehavior = new MoveRun();
	}

	public void setAttackBehavior(IAttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}

	public void setDefendBehavior(IDefendBehavior defendBehavior) {
		this.defendBehavior = defendBehavior;
	}

	public void setMoveBehavior(IMoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}

	protected void attack() {
		attackBehavior.attack();
	}

	protected void defend() {
		defendBehavior.defend();
	}

	protected void move() {
		moveBehavior.move();
	}

}
