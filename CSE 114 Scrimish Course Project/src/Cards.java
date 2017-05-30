// Daniel Garcia
// SBU ID: *********
// CSE 114
// Scrimish Course Project

public abstract class Cards {

    protected String name;
    protected int value;
    protected String type;
    protected String abbreviation;
    protected final static int DEAD = -1;
    protected final static int ALIVE = 1;
    protected int status;

    protected abstract String getName();
    protected abstract int getValue();
    protected abstract String getAbbreviation();
    protected abstract void setAbbreviation();
    protected abstract void setStatus(int status);
    protected abstract String getType();
    protected abstract int getStatus();

}

//#1 Dagger Card
class Dagger extends Cards {

    public Dagger() {
        this.value = 1;
        this.type = "NORMAL";
        this.abbreviation = "DA";
        this.status = ALIVE;
        this.name = "Dagger";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//#2 Sword Card
class Sword extends Cards {

    public Sword() {
        this.value = 2;
        this.type = "NORMAL";
        this.abbreviation = "SW";
        this.status = ALIVE;
        this.name = "Sword";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//#3 Morning Star Card
class MorningStar extends Cards {

    public MorningStar() {
        this.value = 3;
        this.type = "NORMAL";
        this.abbreviation = "MS";
        this.status = ALIVE;
        this.name = "Morning Star";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//#4 War Axe Card
class WarAxe extends Cards {

    public WarAxe() {
        this.value = 4;
        this.type = "NORMAL";
        this.abbreviation = "WA";
        this.status = ALIVE;
        this.name = "War Axe";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//#5 Halberd Card
class Halberd extends Cards {

    public Halberd() {
        this.value = 5;
        this.type = "NORMAL";
        this.abbreviation = "HA";
        this.status = ALIVE;
        this.name = "Halberd";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//#6 Longsword Card
class LongSword extends Cards {

    public LongSword() {
        this.value = 6;
        this.type = "NORMAL";
        this.abbreviation = "LS";
        this.status = ALIVE;
        this.name = "Longsword";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//Archer Card
class Archer extends Cards {

    public Archer() {
        this.value = 0;
        this.type = "SPECIAL";
        this.abbreviation = "AR";
        this.status = ALIVE;
        this.name = "Archer";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//Shield Card
class Shield extends Cards {

    public Shield() {
        this.value = 0;
        this.type = "SPECIAL";
        this.abbreviation = "SH";
        this.status = ALIVE;
        this.name = "Shield";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}

//Crown Card
class Crown extends Cards {

    public Crown() {
        this.value = 0;
        this.type = "SPECIAL";
        this.abbreviation = "CR";
        this.status = ALIVE;
        this.name = "Crown";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation() {
        this.abbreviation = "FD";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

}
