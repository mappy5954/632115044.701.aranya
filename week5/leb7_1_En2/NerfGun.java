package leb7_1_En2;
//632115044 Aranya Baramimahasan
public class NerfGun {
    private int num = 0;
    private static int gunID = 0;

    public NerfGun(){
        this.num = 0;
        gunID++;
    }
    public NerfGun(int number){
        this.num = number;
        gunID++;
    }

	public void reload(int i) {
        if (num + i <= 15){  //don't have bullet more then 15
            this.num = num + i;
        }
        else{ //When bullet more then 15
            System.out.println("Error!! the ammunition is overload");
        }
	}

	public void fire() {
        if (num == 0){ //When we have 0 bullet but we want to fire
            System.out.println("There is on ammuition");
        }
        else {
            this.num--; //when we have a bullet and we have to fire. 1 BANG !!! / 1 time
            System.out.println("BANG !!!");
        }
        
	}

	public void displayNumOfAmmunition() { //count bullet do we have
        System.out.println(num + " bullrt left");
	}

	public void displayGunID() { //what the gun we use now
        System.out.println("The ID of this gun is "+gunID);
	}

}
