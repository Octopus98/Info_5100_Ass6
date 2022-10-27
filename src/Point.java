/**
 * Assignment6
 * [Yuhao Zhang]
 * [002743843]
 * [Section08]
 */

public class Point {

    private int totalPoint;
    private int earnedPoint;
    private int assPercent;

    //Set values
    public void setTotal(int total){
        totalPoint = total;
    }
    public void setEarned(int earned){
        earnedPoint = earned;
    }
    public void setAssPercent(int percent){
        assPercent = percent;
    }

    //Get values
    public int getTotal(){
        System.out.println("Total point is:" + totalPoint);
        return totalPoint;
    }
    public int getEarned(){
        System.out.println("You get:" + earnedPoint);
        return earnedPoint;
    }
    public int getAssPercent(){
        System.out.println("This assignment count " + assPercent + "%");
        return assPercent;
    }

}

