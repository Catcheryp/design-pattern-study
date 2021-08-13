public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    // 使用 synchronized 为了解决多线程带来的创建多余一个对象的问题
    public static synchronized ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Bolier");
        return uniqueInstance;
    }

    // public static ChocolateBoiler getInstance(){
    //     if(uniqueInstance == null){
    //         System.out.println("Creating unique instance of Chocolate Boiler");
    //         uniqueInstance = new ChocolateBoiler();
    //     }
    //     System.out.println("Returning instance of Chocolate Bolier");
    //     return uniqueInstance;
    // }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
