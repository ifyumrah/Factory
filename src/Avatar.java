public class Avatar {
    int posX;
    int posY;
    int dx;
    int dy;
    int height;
    int width;
    String power;
    String role;
    String weakness;


    public Avatar(){
        posX = 400;
        posY = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "protagonist";
        weakness = "water";
    }

    public Avatar(int pPosX, int pPosY, int pDx, int pDy, int pHeight, int pWidth, String pRole, String pPower, String pWeakness){

        posX = pPosX;
        posY = pPosY;
        dx = pDx;
        dy = pDy;
        height = pHeight;
        width = pWidth;
        role = pRole;
        power = pPower;
        weakness = pWeakness;

    }

    public void print(){
        System.out.println("The " + role + " can " + power + " and their weakness is " + weakness + ".");
        System.out.println("They are at the location (" + posX+ ","+posY +")");


    }
}
