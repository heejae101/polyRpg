package game;

public abstract class Unit {
	/**
	 * 현재체력, 최대체력, 스킬포인트, 평타데미지
	 */
	private int curHp;
	private int maxHp;
	private int power;
	private String name;
	
	public Unit(String name, int maxHp, int power) {
		this.name = name;
		this.maxHp = maxHp;
		this.curHp = maxHp;
		this.power = power;
	}

	public int getCurHp() {
		return curHp;
	}

	public void setCurHp(int curHp) {
		this.curHp = curHp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attack(Unit target) {
		target.curHp -= power;
		System.out.println("[" + name + "] 이 " + "[" + target.name + "] 에게 " + power + "의 데미지를 입힙니다. ");
		if(target.curHp <= 0) {
			System.out.println("[" + target.name + "] 을 쳐치했습니다.");
			target.curHp = 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("[" + this.name + "] [" + this.curHp + "/" + this.maxHp + "] [" + this.power + "]");
	}
	
}
